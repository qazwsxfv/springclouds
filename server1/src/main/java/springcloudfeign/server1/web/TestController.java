package springcloudfeign.server1.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springcloudfeign.server1.service.Test2Service;
import springcloudfeign.server1.service.TestService;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private Test2Service test2Service;

    @RequestMapping("haha")
    @ResponseBody
    public String haha(){
        System.out.println(testService.hello());

        return "";
    }

    @RequestMapping("haha2")
    @ResponseBody
    public String haha2(){
        System.out.println(test2Service.hello());

        return "";
    }

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    @ResponseBody
    public String home() {
        return "hi " + "zs" + " ,i am from port:" + 8088;
    }
    @ResponseBody
    public String hiError() {
        return "hi,"+"ls"+",sorry,error!";
    }



}
