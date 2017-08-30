package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.service_domain.FoodType_Bean;

public class foodtype_Dao_impl extends BaseDao<FoodType_Bean> implements foodtype_Dao{
	//��ȡ����
	@Override
	public String getFoodTypeName(String FT_id) {
		String sql="select FT_name from food_type where FT_id=?";
		FoodType_Bean f=query(sql, FT_id);
		if(f==null){
			return "";
		}
		else{
		return f.getFT_name();}
	}
	//���ò�Ʒ����
	@Override
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean) {
		String sql="insert into food_type values"+" FT_id=? ,FT_name=?,C_id=? ";
		boolean f=insert(sql, foodType_Bean.getFT_id(), foodType_Bean.getFT_name(), foodType_Bean.getC_id());
		return f;
	}
	@Override
	public List<FoodType_Bean> getfoodtype(String C_id) {
		String sql="select * from food_type where C_id=?";
		return queryforList(sql, C_id);
	}
	@Override
	public boolean deleteFoodType(String FT_id) {
		String sql = "delete from food_type where FT_id = ?";
		return delete(sql, FT_id);
	}
	@Override
	public boolean changeFoodType(FoodType_Bean foodType_Bean) {
		String sql="update food_type set FT_name=?  where FT_id=?";
		return update(sql, foodType_Bean.getFT_name(),foodType_Bean.getFT_id());
	}

	
}
