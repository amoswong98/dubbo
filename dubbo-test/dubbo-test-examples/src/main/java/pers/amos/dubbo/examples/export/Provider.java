package pers.amos.dubbo.examples.export;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author amos wong
 * @create 2021-11-27 8:21 下午
 */

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
