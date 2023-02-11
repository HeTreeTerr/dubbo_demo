package com.hss.service;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

//@SPI(value = "wrapper")
@SPI
public interface CarService {

    @Adaptive(value = "cardType")
    String color(URL url,String name);
}
