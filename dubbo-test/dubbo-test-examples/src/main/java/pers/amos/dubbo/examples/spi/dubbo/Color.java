package pers.amos.dubbo.examples.spi.dubbo;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author amos wong
 * @create 2021-09-21 4:01 下午
 */
@SPI
public interface Color {
    void printColor();
}
