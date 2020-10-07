package com.hss.service.impl;

import com.alibaba.dubbo.common.URL;
import com.hss.gmall.service.impl.UserServiceImpl;
import com.hss.service.CarService;

public class CarWrapper implements CarService {

    private CarService carService;

    private UserServiceImpl userServiceImpl;

    public CarService getCarService() {
        return carService;
    }
    //由spi容器注入
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    //由注入spring容器注入对象
    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    //    public CarWrapper(CarService carService) {
//        this.carService = carService;
//    }

    public String color(URL url, String name) {
        System.out.println("前置处理。。");
        userServiceImpl.getUserAddressList("4");
        String result =  carService.color(url,name);
        System.out.println("后置处理。。");
        return result;
    }
}
