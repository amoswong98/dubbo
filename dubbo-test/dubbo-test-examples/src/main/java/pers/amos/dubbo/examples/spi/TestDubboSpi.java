package pers.amos.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author amos wong
 * @create 2021-10-30 10:39 上午
 */

public class TestDubboSpi {

    @Test
    public void testDubboSpi() {
        ExtensionLoader<Color> extensionLoader = ExtensionLoader.getExtensionLoader(Color.class);
        Color green = extensionLoader.getExtension("green");
        green.printColor();
        Color red = extensionLoader.getExtension("red");
        red.printColor();
    }
}
