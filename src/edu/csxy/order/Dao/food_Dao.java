package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//查询菜品所有信息
	public Food_Bean getFoodInfo(int F_id);
	
	//查询所选店铺里所有菜品
	public List<Food_Bean> getAllFood(String C_id);
	
	//新建菜品
	public boolean setFood(Food_Bean food_Bean);
	
	//修改菜品信息
	public boolean ChangeFood(Food_Bean food_Bean);
	
	//删除菜品
	public boolean deleteFood(String F_id);
	
	//修改菜品评分
	public boolean ChangeEstimate(String F_id,Float estimate);
	
	//
	
	
}
