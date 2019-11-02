package com.hss.gmall.service;

import java.util.List;

import com.hss.gmall.bean.UserAddress;

public interface OrderService {

	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);
	//public void initOrder(String userId);
}
