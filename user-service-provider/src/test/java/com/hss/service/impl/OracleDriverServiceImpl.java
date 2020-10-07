package com.hss.service.impl;

import com.hss.service.DriverService;

public class OracleDriverServiceImpl implements DriverService {

    public String driver(String name) {
        System.out.println("oracle驱动加载。。");
        return "oracle";
    }
}
