package edu.csxy.order.service;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.manager_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.manager_Dao_impl;

public class Manager_service {
	manager_Dao manager=new manager_Dao_impl();
	C_Request_Dao c_Request=new C_Request_impl();
	public void CheakRequest(int CR_id) {
		//查询商家入驻请求
	}
	public void ChangeRequest(int CR_id,int C_check){
		//更改商家入驻申请
	}
	public void CheckPromotionRequest(int PR_id){
		//查询推广申请
	}
	public void ChangePromotionRequest(int PR_id){
		//更改推广申请状态
	}
	public void ReleasePromotion(){
		//？？？？什么鬼
	}
}
