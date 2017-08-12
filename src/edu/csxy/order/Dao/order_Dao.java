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
	
	//查询所有餐厅订单信息
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id);
	
	//查询所有个人订单信息
	public List<Order_Bean> getPersonAllOrderInfo(int P_id);
	
	//查询所有单位订单信息
	public List<Order_Bean> getTeamAllOrderInfo(int T_id);
	
	//查询订餐计划内所包含的订单
	public List<Order_Bean> getSetMealAllOrderInfo(int S_id);
	
	//根据状态查询所有餐厅订单信息
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id,String state);
	
	//根据状态查询所有个人订单信息
	public List<Order_Bean> getPersonAllOrderInfo(int P_id,String state);
	
	//根据状态查询所有单位订单信息
	public List<Order_Bean> getTeamAllOrderInfo(int T_id,String state);
	
	//根据状态查询计划所包含的订单
	public List<Order_Bean> getSetMealAllOrderInfo(int S_id,String state);
}
