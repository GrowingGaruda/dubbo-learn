package hao.du.dubbo.learn.provider1;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * @author duhao
 * @date 2020-03-10 16:57
 */
@SpringBootApplication
//改变自动扫描的包
//@ComponentScan(basePackages = {"hao.du.dubbo.learn"})
//@DubboComponentScan
@EnableDubbo
public class ProviderMain1 {
    private static final Logger logger = LoggerFactory.getLogger(ProviderMain1.class);
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(ProviderMain1.class, args);
        //启动完成
        logger.info("***********************");
        logger.info("****ProviderMain111111服务启动成功！***");
        logger.info("***********************");
    }
}
