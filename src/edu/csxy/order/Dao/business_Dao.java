package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Business_Bean;

public interface business_Dao {
	//查询商家用户信息
	public List<Business_Bean> getBusinessInfo(int B_id);
	
	//写入商家信息
	public void setBusinessInfo(Business_Bean Business_Bean);

}
