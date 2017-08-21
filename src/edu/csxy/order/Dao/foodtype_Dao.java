package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.FoodType_Bean;

public interface foodtype_Dao {
	public String getFoodTypeName(String FT_id);//获取菜品类型名字
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean);//设置菜品名字
	public List<FoodType_Bean> getfoodtype(String C_id);//根据商家获取list
	//删除类别
	//修改类别
	
}
