package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Order_Food;

public interface order_food_Dao {
	//设置菜品评分
	public boolean setFoodestimate(String O_id,String F_id,float F_estimate);
	//订单菜品的数目
	public boolean count(String O_id,String F_id,int count);
	//查看订单菜品数目和评分
	public Order_Food query(String O_id,String F_id);
}
