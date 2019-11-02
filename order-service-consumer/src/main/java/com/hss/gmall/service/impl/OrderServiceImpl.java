package com.hss.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hss.gmall.bean.UserAddress;
import com.hss.gmall.service.OrderService;
import com.hss.gmall.service.UserService;
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

	@Autowired
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		
		System.out.println("用户id:"+userId);
		//1.查询用户的收货地址
		List<UserAddress> addresseList = userService.getUserAddressList(userId);
		//System.out.println(addresseList);
		for(UserAddress userAddress : addresseList) {
			System.out.println(userAddress.getUserAddress());
		}
		
		return addresseList;
	}

}
