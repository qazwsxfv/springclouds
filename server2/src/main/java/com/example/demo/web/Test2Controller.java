package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test2")
public class Test2Controller {
    @RequestMapping("hello")
    public String hello(){
        System.out.println("haha2");
        return "haha2";
    }
}
