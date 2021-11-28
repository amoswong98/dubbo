package pers.amos.dubbo.examples.export;

/**
 * @author amos wong
 * @create 2021-11-27 8:19 下午
 */

public class ExportTestServiceImpl implements ExportTestService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
