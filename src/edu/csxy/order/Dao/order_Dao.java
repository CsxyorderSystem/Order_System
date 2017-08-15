package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//新增订单
	public boolean AddOrder(Order_Bean order_Bean);
	
	//订单状态修改
	public boolean changeOrderState(int O_id,String O_state);
	//修改订单价格
	public boolean changeOrderPrice(float price);
	
	//查询订单信息
	public List<Order_Bean> getOrderInfo(int O_id);
	
	//查询所有餐厅订单信息
	public List<Order_Bean> getCanteenOrderInfo(String C_id);
	
	//查询所有个人订单信息
	public List<Order_Bean> getPersonOrderInfo(String P_id);
	
	//查询所有单位订单信息
	public List<Order_Bean> getTeamOrderInfo(String T_id);
	
	//查询订餐计划内所包含的订单
	public List<Order_Bean> getSetMealOrderInfo(int S_id);
	
	//根据状态查询所有餐厅订单信息
	public List<Order_Bean> getCanteenOrderInfo(String C_id,String state);
	
	//根据状态查询所有个人订单信息
	public List<Order_Bean> getPersonOrderInfo(String P_id,String state);
	
	//根据状态查询所有单位订单信息
	public List<Order_Bean> getTeamOrderInfo(String T_id,String state);
	
	//根据状态查询计划所包含的订单
	public List<Order_Bean> getSetMealOrderInfo(int S_id,String state);
}
