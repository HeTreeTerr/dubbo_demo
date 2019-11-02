package com.hss.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
/**
 * 1.导入依赖
 * 		1）导入dubbo-starter
 * 		2)导入dubbo的其他依赖
 * @author lenovo
 * 
 * springBoot与dubbo整合的三种方式：
 * 1.导入dubbo-starter,在application.properties配置属性，
 * 	使用@Service[暴露服务]使用@Reference[调用服务]
 *  @EnableDubbo 开启包识别
 * 2.保留dubbo xml配置文件
 *  导入dubbo-starter,@ImportResource(location="classpath:provider.xml")
 *  导入配置文件即可
 * 3.使用注解API的方式：
 *   将每一个组件手动创建到容器中，让dubbo来扫描组件即可
 */
//@EnableDubbo //开启基于注解的dubbo功能
//@ImportResource(locations="classpath:provider.xml")
@EnableDubbo(scanBasePackages="com.hss.gmall")
@EnableHystrix
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
