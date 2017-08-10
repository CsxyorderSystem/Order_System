package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//新增订单
	public void AddOrder(Order_Bean order_Bean);
	
	//订单状态修改
	public void changeOrderState(int O_id,String O_state);
	
	//查询订单信息
	public Order_Bean getOrderInfo(int O_id);
	
	//查询所有订单信息
	public List<Order_Bean> getAllOrderInfo();
}
