package hao.du.dubbo.learn.provider1.service.impl;

import org.apache.dubbo.config.annotation.Service;
import hao.du.dubbo.learn.service.base.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author duhao
 * @date 2020-03-10 16:52
 */
//@Service(interfaceClass = TestService.class)
@Service(version = "1.0.0")
@Component
public class TestServiceImpl implements TestService {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public String test(String key) {
        String str = "我是服务端111111的：" + key;
        logger.info(str);
        return str;
    }
}
