package pers.amos.dubbo.examples.spi.java;

/**
 * @author amos wong
 * @create 2021-09-21 11:51 上午
 */

public class NightKing implements GameOfThrones {
    @Override
    public void sayName() {
        System.out.println("I'm night king!");
    }
}
