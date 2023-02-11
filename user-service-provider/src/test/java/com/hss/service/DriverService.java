package com.hss.service;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface DriverService {

    String driver(String name);
}
