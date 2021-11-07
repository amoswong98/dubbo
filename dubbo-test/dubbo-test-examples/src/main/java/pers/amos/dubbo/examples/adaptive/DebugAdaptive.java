package pers.amos.dubbo.examples.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import org.junit.Test;

/**
 * @author amos wong
 * @create 2021-10-31 10:48 上午
 *
 * 用来debug，查看生成代理类代码的测试类
 * 生成的代理类
 * @see com.alibaba.dubbo.rpc.Protocol$Adaptive
 */

public class DebugAdaptive {

    @Test
    public void debugAdaptive() {
        URL url = new URL("dubbo", "127.0.0.1", 7100);
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        protocol.refer(Protocol.class, url);
    }
}
