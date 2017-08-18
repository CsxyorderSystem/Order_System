package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.service_domain.FoodType_Bean;

public class foodtype_Dao_impl extends BaseDao<FoodType_Bean> implements foodtype_Dao{
	//获取名字
	@Override
	public String getFoodTypeName(int FT_id) {
		// TODO Auto-generated method stub
		String sql="select FT_name from food_type where FT_id=?";
		FoodType_Bean f=query(sql, FT_id);
		return f.getFT_name();
	}
	//设置菜品名字
	@Override
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into food_type values"+" FT_id=? ,FT_name=?,C_id=? ";
		boolean f=insert(sql, foodType_Bean.getFT_id(), foodType_Bean.getFT_name(), foodType_Bean.getC_id());
		return f;
	}

	
}
