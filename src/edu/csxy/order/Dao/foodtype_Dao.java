package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.FoodType_Bean;

public interface foodtype_Dao {
	public String getFoodTypeName(int FT_id);//获取菜品类型名字
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean);//设置菜品名字
	
}
