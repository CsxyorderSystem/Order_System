package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//查询菜品所有信息
	public Food_Bean getFoodInfo(int F_id);
	
	//查询所选店铺里所有菜品
	public List<Food_Bean> getAllFood(int C_id);
	
	//新建菜品
	public void setFood(Food_Bean food_Bean);
	
	//修改菜品信息
	public void ChangeFood(Food_Bean food_Bean);
	
	//删除菜品
	public void deleteFood(int F_id);
	
	//修改菜品评分
	public void ChangeEstimate(int F_id,Float estimate);
	
	//
	
	
}
