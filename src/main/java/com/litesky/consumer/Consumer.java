package com.litesky.consumer;

import com.litesky.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String []args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        DemoService demoService= (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");
        System.out.println(hello);
    }
}
