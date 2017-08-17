package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.order_set_meal_Dao;
import edu.csxy.order.service_domain.Order_set_meal;

public class order_set_meal_Dao_impl extends BaseDao<Order_set_meal> implements order_set_meal_Dao {

	@Override
	public boolean setsetmealestimate(String O_id, String S_id, float S_estimate) {
		// TODO Auto-generated method stub
		String sql="insert into order_setmeal(O_id,S_id,S_rstimate) values"+" (?,?,?)";
		boolean os=insert(sql, O_id,S_id,S_estimate);
		return os;
	}

	@Override
	public boolean count(String O_id, String S_id, int count) {
		// TODO Auto-generated method stub
		String sql="insert into order_setmeal(O_id,S_id,count) values"+" (?,?,?)";
		boolean os=insert(sql, O_id,S_id,count);
		return os;
	}

	@Override
	public List<Order_set_meal> setOSMperson(String O_id, String T_id) {
		String sql="select * from order_setmeal where O_id=?,T_id=?";
		
		return queryforList(sql, O_id,T_id);
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public boolean getOSMnumber(String O_id, String T_id, String OSM_person) {
		String sql="insert into order_setmeal(O_id,T_id,OSM_person) values"+" (?,?,?)";
		return insert(sql, O_id,T_id,OSM_person);
		
	}

	
}
