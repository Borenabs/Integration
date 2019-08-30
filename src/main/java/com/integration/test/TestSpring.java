package com.integration.test;

import com.integration.service.AccountServiceInf;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        //1.获取配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        //2.获取对象
        AccountServiceInf accountService = (AccountServiceInf)ac.getBean("accountService");
        //3.调用方法
        accountService.selectAll();
    }
}
