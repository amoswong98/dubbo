package pers.amos.dubbo.examples.adaptive;

import com.alibaba.dubbo.common.URL;

/**
 * @author amos wong
 * @create 2021-10-30 8:07 下午
 *
 * 自适应拓展类的核心实现 – 在组件方法被调用时，通过代理的方式加载指定的实现类，并调用被代理的方法。
 * MakeBlueDrug持有成员变量makeDrug，程序启动的时候会将AdaptiveMakeDrugProxy通过setter注入到MakeBlueDrug
 * 中，同时当我们调用MakeBlueDrug#makeBlueDrug方法的时候会将url传递给AdaptiveMakeDrugProxy，此时
 * AdaptiveMakeDrugProxy就会从url中获取拓展类的名称，然后调用具体拓展类的方法
 */

public class MakeBlueDrug implements MakeDrug{
    private MakeDrug makeDrug;

    public void setMakeDrug(MakeDrug makeDrug) {
        this.makeDrug = makeDrug;
    }

    @Override
    public void makeIcedDrug(URL url) {
        System.out.println("make blue drug...");
    }
}
