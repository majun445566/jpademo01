package com.example.mj.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:EX-MAJUN004
 * @Date:2020/10/26-10-26-21:24
 * @Description:com.example.mj.demo01
 * @Version:1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("all")
    public String getUserAll(){
        return "hello word";
    }
}
