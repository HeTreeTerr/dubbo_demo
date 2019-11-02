package com.hss.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hss.gmall.bean.UserAddress;
import com.hss.gmall.service.OrderService;
import com.hss.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
 * 1.将服务提供者注册到注册中心（暴露服务）
 * 		1）导入dubbo依赖（2.6.2，操作zookeeper的客户端）
 * 		2）
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * 		
 * @author lenovo
 *
 */
@Service
public class OrderServiceImpl implements OrderService{

	//@Autowired
	//@Reference(url="127.0.0.1:20882") //dubbo直连：通过制定url绕过zookeeper,直接指向消费者
	@Reference(loadbalance="random") //配置负载均衡
	UserService userService;
	
	@HystrixCommand(fallbackMethod="hello")
	public List<UserAddress> initOrder(String userId) {
		
		System.out.println("用户id:"+userId);
		//1.查询用户的收货地址
		List<UserAddress> addresseList = userService.getUserAddressList(userId);
		return addresseList;
	}
	
	public List<UserAddress> hello(String userId) {
		
		System.out.println("hello..用户id:"+userId);
		
		return Arrays.asList(new UserAddress(110, "测试地址", "jojo", "嘿嘿", "10086", "Y"));
	}

}
