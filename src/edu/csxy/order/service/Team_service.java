package edu.csxy.order.service;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.service_domain.Order_Bean;


public class Team_service {
	team_Dao person=new team_Dao_impl();
	order_Dao order=new order_Dao_impl();
	business_Dao business=new business_Dao_impl();
	public void QueryAllCanteen(){
		//查询所有餐厅
	}
	public void QueryCanteen(int C_id){
		//查询餐厅信息
	}
	public void QueryAllOrder(){
		//查询所有订单
	}
	public void QueryOrder(int T_id){
		//查询个人订单
	}
	public Order_Bean CreateOrder(){
		return null;
		//创建订单
	} 
	public void PayOrder(){
		//支付订单
	}
	public team_Dao ManagerInfo(){
		return person;
		//管理单位信息
	}
	public void EstimateOrder(int T_id,int O_id,int C_id,String Estlimate){
		//评价订单
	}
}
