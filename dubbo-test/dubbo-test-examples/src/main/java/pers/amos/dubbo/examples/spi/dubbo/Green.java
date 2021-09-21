package pers.amos.dubbo.examples.spi.dubbo;

/**
 * @author amos wong
 * @create 2021-09-21 4:02 下午
 */

public class Green implements Color {
    @Override
    public void printColor() {
        System.out.println("print green");
    }
}
