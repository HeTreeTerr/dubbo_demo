package com.hss.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.hss.service.DriverService;

public class DubboDriverSpiTest {

    public static void main(String[] args) {
        ExtensionLoader<DriverService> extensionLoader = ExtensionLoader.getExtensionLoader(DriverService.class);
        DriverService driverService = extensionLoader.getExtension("mysql");
        System.out.println(driverService.driver("jojo"));
    }
}
