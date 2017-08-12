package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Set_meal_Bean;

public interface set_meal_Dao {
	//获取餐厅得全部用餐计划
	public Set_meal_Bean getCantennSet_meal(int C_id);
	//获取单位用餐计划
	public Set_meal_Bean getTeamSet_meal(int T_id);
	//获取
}
