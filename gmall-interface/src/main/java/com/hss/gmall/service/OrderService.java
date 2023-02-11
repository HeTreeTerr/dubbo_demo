package com.hss.gmall.service;

import java.util.List;

import com.hss.gmall.bean.UserAddress;

public interface OrderService {

	/**
	 * 初始化订单
	 * @param userId
	 */
	List<UserAddress> initOrder(String userId);
	//void initOrder(String userId);
}
