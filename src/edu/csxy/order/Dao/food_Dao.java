package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//查询菜品所有信息
	public List<Food_Bean> getFoodInfo(int F_id);
	
	//查询所有菜品
	public List<Food_Bean> getAllFodd();
	
	//新建菜品

}
