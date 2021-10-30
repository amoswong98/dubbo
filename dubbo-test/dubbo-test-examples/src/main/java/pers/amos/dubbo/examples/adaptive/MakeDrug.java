package pers.amos.dubbo.examples.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;

/**
 * @author amos wong
 * @create 2021-10-30 7:50 下午
 */

public interface MakeDrug {
    @Adaptive
    void makeIcedDrug(URL url);
}
