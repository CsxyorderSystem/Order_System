package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Set_meal_Bean;

import java.util.List;

import edu.csxy.order.service_domain.Set_meal_Bean;

public interface set_meal_Dao {
	
	//查询餐厅用餐计划
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id);
	
	//查询单位用户用餐计划
	public List<Set_meal_Bean> getTeamSet_meal(String T_id);
	
	//查询用餐计划内容
	public Set_meal_Bean getSet_meal(int S_id);
	
	//根据状态查询餐厅用餐计划
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id,int S_state);
	
	//根据类型查询餐厅用餐计划
	public List<Set_meal_Bean> getCanteenSet_mealByType(String C_id,int S_type);
	
	//根据状态查询单位用餐计划
	public  List<Set_meal_Bean> getTeamSet_meal(String T_id,int S_state);
	
	//新建用餐计划
	public boolean setSet_meal(Set_meal_Bean set_meal_Bean); 
	
	//修改价格
	public boolean changeSet_meal_price(int S_id,float S_price);
}
