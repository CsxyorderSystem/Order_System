package edu.csxy.order.service;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Person_Bean;

public class Person_service {
	personal_Dao person=new personal_Dao_impl();
	order_Dao order=new order_Dao_impl();
	business_Dao business=new business_Dao_impl();
	public void QueryOrder(int P_id){
		//查询所有个人订单
	}
	public void QueryCanteen(int C_id){
		//查询餐厅内菜品信息或者全部信息
	}
	public void QueryAllOrder(){
		//查询个人所有订单
	}
	public void QueryAllCanteen(){
		//查询所有餐厅列表
	}
	public void PayOrder(){
		//查询支付订单
	}
	public Person_Bean ManagelInfo(){
		return null;
		//修改个人信息
	}
	public Order_Bean CreateOrder(){
		return null;
		//创建订单
	}
	public void EstlimateOrder(int P_id,int C_id,String Estlimate){
		//评价订单
	}
}
