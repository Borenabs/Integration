package com.integration.controller;

import com.integration.entity.Account;
import com.integration.service.AccountServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountServiceInf accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("TestSpringMVC:调用表现成全查方法");
        //如果在这里能成功调用service层的方法就证明spring整合SpringMVC成功了
        //accountService.selectAll();
        List<Account> accounts = accountService.selectAll();
        for (Account account:accounts){
            System.out.println(account);
        }
        model.addAttribute("account",accounts);
        return "list";
    }
    @RequestMapping("/insert")
    public String insert(@RequestParam("name") String name,@RequestParam("money") String money){
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        accountService.insert(account);
        return "redirect:findAll";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam("id")Integer id){
        accountService.delete(id);
        return "redirect:findAll";
    }
}
