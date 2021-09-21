package pers.amos.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import pers.amos.dubbo.examples.spi.dubbo.Color;
import pers.amos.dubbo.examples.spi.java.GameOfThrones;

import java.util.ServiceLoader;

/**
 * @author amos wong
 * @create 2021-09-21 11:59 上午
 */

public class TestSpi {

    @Test
    public void testJavaSPI() {
        ServiceLoader<GameOfThrones> serviceLoader = ServiceLoader.load(GameOfThrones.class);
        serviceLoader.forEach(GameOfThrones::sayName);
        System.out.println("======test java spi=====");
        // 一次性会把所有拓展类的实现全部加载出来
    }

    @Test
    public void testDubboSPI() {
        System.out.println("======test dubbo spi=====");
        ExtensionLoader<Color> extensionLoader = ExtensionLoader.getExtensionLoader(Color.class);
        // 按需加载
        Color green = extensionLoader.getExtension("green");
        green.printColor();
        Color yellow = extensionLoader.getExtension("yellow");
        yellow.printColor();
    }
}


