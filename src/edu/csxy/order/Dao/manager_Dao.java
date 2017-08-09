package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Request_Bean;

public interface manager_Dao {
	//查询商家入驻申请单
	public List<Canteen_Request_Bean> getRequestList();
	
	//更改商家入驻申请单
	public void changeRequestList(Canteen_Request_Bean Canteen_Rquest_Bean);
	
	

}
