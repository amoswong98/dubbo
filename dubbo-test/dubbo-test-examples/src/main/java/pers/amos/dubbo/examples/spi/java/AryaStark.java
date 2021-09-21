package pers.amos.dubbo.examples.spi.java;

/**
 * @author amos wong
 * @create 2021-09-21 11:52 上午
 */
public class AryaStark implements GameOfThrones {

    @Override
    public void sayName() {
        System.out.println("Valar Morghulis, I'm Arya Stark!");
    }
}
