package pers.amos.dubbo.examples.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2021-10-30 10:37 上午
 */
@SPI
public interface Color {
    void printColor();
}
