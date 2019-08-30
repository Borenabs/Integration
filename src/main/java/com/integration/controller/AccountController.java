package com.integration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("TestSpringMVC:调用表现成全查方法");
        //如果在这里能成功调用service层的方法就证明spring整合SpringMVC成功了
        return "list";
    }
}
