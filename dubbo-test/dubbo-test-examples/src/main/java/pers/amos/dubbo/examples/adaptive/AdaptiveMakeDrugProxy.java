package pers.amos.dubbo.examples.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.apache.commons.lang3.StringUtils;

/**
 * @author amos wong
 * @create 2021-10-30 7:51 下午
 *
 * AdaptiveMakeDrug 是一个代理类，它主要做了三件事情：
 * 1.从 URL 中获取 WheelMaker 名称
 * 2.通过 SPI 加载具体的 WheelMaker
 * 3.调用目标方法
 */
public class AdaptiveMakeDrugProxy implements MakeDrug {

    @Override
    public void makeIcedDrug(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("url is empty");
        }
        // 从url中获取拓展类名称
        String extensionName = url.getParameter("make.drug");
        if (StringUtils.isEmpty(extensionName)) {
            throw new IllegalArgumentException("extensionName is empty");
        }
        // 根据拓展类名加载拓展类
        MakeDrug extension = ExtensionLoader.getExtensionLoader(MakeDrug.class).getExtension(extensionName);
        // 调用拓展类方法
        extension.makeIcedDrug(url);
    }
}
