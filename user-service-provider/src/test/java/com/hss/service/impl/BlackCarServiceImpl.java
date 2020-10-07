package com.hss.service.impl;

import com.alibaba.dubbo.common.URL;
import com.hss.service.CarService;

public class BlackCarServiceImpl implements CarService {

    public String color(URL url,String name) {
        System.out.println("BlackCar Doing " + name);
        return "Black";
    }
}
