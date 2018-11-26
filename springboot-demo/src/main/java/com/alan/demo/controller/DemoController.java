package com.alan.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    /*@Value("${alantest}")
    private String alantest;*/

    @RequestMapping("/")
    public String index(){
        return "SpringBoot Demo";
    }
}
