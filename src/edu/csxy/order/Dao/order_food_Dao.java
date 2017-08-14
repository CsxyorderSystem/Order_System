package edu.csxy.order.Dao;

public interface order_food_Dao {
	//设置菜品评分
	public boolean setFoodestimate(int O_id,int F_id);
	//订单菜品的数目
	public boolean count(int O_id,int F_id);
}
