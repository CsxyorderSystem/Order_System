package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Request_Bean;

public interface C_Request_Dao {
	    //查询所有商家入驻申请单
		public List<Canteen_Request_Bean> getAllRequestList();
		
		//提交申请单
		public boolean setRequest(Canteen_Request_Bean canteen_Rquest_Bean,String B_id,String C_id);
		
		//查询指定商家申请表
		public Canteen_Request_Bean getReuqest(String B_id);

		//更改商家入驻申请单
		public boolean changeRequestList(Canteen_Request_Bean canteen_Rquest_Bean);
		
}
