package com.hss.service.impl;

import com.hss.service.DriverService;

public class MysqlDriverServiceImpl implements DriverService {
    public String driver(String name) {
        System.out.println("mysql驱动。。");
        return "mysql";
    }
}
