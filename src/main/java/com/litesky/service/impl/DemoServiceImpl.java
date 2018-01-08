package com.litesky.service.impl;

import com.litesky.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello"+name;
    }


}
