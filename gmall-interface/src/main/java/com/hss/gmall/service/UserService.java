package com.hss.gmall.service;

import java.util.List;

import com.hss.gmall.bean.UserAddress;
/**
 * 用户服务
 * @author lenovo
 *
 */
public interface UserService {
	/**
	 * 由用户id返回收货地址
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
