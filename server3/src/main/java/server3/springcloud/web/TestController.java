package server3.springcloud.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("hehe");
        return "hehe";
    }
}
