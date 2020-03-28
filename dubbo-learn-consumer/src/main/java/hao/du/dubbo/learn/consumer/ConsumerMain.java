package hao.du.dubbo.learn.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author duhao
 * @date 2020-03-11 16:10
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerMain {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerMain.class);
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(ConsumerMain.class, args);
        //启动完成
        logger.info("***********************");
        logger.info("****ConsumerMain服务启动成功！***");
        logger.info("***********************");
    }
}
