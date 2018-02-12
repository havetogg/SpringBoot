package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangwenxing on 2018/2/6.
 */
@RestController
@SpringBootApplication
public class TestSpringBoot {

    @RequestMapping(value = "hello")
    public String greeting(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestSpringBoot.class,args);
    }
}
