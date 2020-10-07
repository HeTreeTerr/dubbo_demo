package com.hss.service.impl;

import com.alibaba.dubbo.common.URL;
import com.hss.service.CarService;

public class RedCarServiceImpl implements CarService {

    public String color(URL url,String name) {
        System.out.println("RedCar Doing " + name);
        return "Red";
    }
}
