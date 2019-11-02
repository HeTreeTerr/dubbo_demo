package com.hss.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.hss.gmall.bean.UserAddress;
import com.hss.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
 * dubbo的标签，暴露接口，
 * @Service(timeout=1000)，
 * springboot可以直接在@Service的属性中设置dubbo的配置属性
 * @author lenovo
 *
 */
@Service 
@Component
public class UserServiceImpl implements UserService{
	
	@HystrixCommand
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("getUserAddressList...3..");
		
		UserAddress address1 = new UserAddress(1, "北京", "userNo001", "jojo", "1330000000", "1");
		UserAddress address2 = new UserAddress(2, "苏州", "userNo002", "zhuzhu", "13300001111", "1");
		
		if(Math.random()<0.5) {
			throw new RuntimeException();
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return Arrays.asList(address1,address2);
	}

}
