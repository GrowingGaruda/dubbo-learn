package hao.du.dubbo.learn.provider.controller;

import hao.du.dubbo.learn.provider.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    private TestServiceImpl testServiceImpl;

    @ResponseBody
    @RequestMapping("/test")
    public String doSome() {
        return testServiceImpl.test("服务端本地调用");
    }

    //    @ResponseBody
    @RequestMapping("/fuck")
    public String fuck() {
        return "fuck";
    }

}
