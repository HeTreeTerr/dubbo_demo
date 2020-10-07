package com.hss.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.hss.service.CarService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DubboCarSpiTest {

    public static void main(String[] args) throws IOException {
        //初始化ioc容器
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        ExtensionLoader<CarService> extensionLoader = ExtensionLoader.getExtensionLoader(CarService.class);
        CarService black = extensionLoader.getExtension("wrapper");

        Map<String,String> map = new HashMap<String, String>();
        map.put("cardType","red");
        URL url = new URL("","",0,map);
        System.out.println(black.color(url,"jerry"));

        //按任意键退出
        System.in.read();
    }
}
