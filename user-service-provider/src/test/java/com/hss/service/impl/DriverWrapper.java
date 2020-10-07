package com.hss.service.impl;

import com.hss.service.DriverService;

public class DriverWrapper implements DriverService {

    private DriverService driverService;
    //通过切面扫描，如果有符合要求的代理类构造对象，直接返回代理类实例
    public DriverWrapper(DriverService driverService) {
        this.driverService = driverService;
    }

    public String driver(String name) {
        System.out.println("前置通知");
        String result = driverService.driver(name);
        System.out.println("后置通知");
        return result;
    }
}
