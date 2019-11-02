package com.hss.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.hss.gmall.bean.UserAddress;
import com.hss.gmall.service.UserService;

public class UserServiceImpl implements UserService{

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl....old....");
		
		UserAddress address1 = new UserAddress(1, "北京", "userNo001", "jojo", "1330000000", "1");
		UserAddress address2 = new UserAddress(2, "苏州", "userNo002", "zhuzhu", "13300001111", "1");
//		try {
//			Thread.sleep(4000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return Arrays.asList(address1,address2);
	}

}
