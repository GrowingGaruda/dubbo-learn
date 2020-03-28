package hao.du.dubbo.learn.consumer.controller;

import hao.du.dubbo.learn.service.base.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    @Reference(version = "1.0.0",check=false)
    private TestService testService;

    @ResponseBody
    @RequestMapping("/test")
    public String doSome() {
        return testService.test("客户端端远程调用");
    }

    //    @ResponseBody
    @RequestMapping("/fuck")
    public String fuck() {
        return "fuck";
    }

}
