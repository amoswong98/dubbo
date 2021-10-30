package pers.amos.dubbo.examples.spi;

/**
 * @author amos wong
 * @create 2021-10-30 10:37 上午
 */

public class Green implements Color {
    @Override
    public void printColor() {
        System.out.println("print green..");
    }
}
