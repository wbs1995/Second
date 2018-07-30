package com.hh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hh/")
public class hhController {
    @RequestMapping(value = "say")
    public void saylove(){
        System.out.println("今天是个晴天");
    }

    @RequestMapping(value = "sayyou")
    public String say(){
        return  "我喜欢你";
    }
}
