package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Business_Bean;

public interface business_Dao {
	//写入商家信息
	public Boolean setBusinessInfo(Business_Bean Business_Bean);

	//查询商家用户信息
	public Business_Bean getBusinessInfo(int B_id);
	//获取商家登录信息
	public Business_Bean getBusiness(int U_id);

	
}
