package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.order_food_Dao;
import edu.csxy.order.service_domain.Order_Food;

public class order_food_Dao_impl extends BaseDao<Order_Food> implements order_food_Dao{

	@Override
	public boolean setFoodestimate(String O_id,String F_id,float F_estimate) {
		// TODO Auto-generated method stub
		String sql="insert into order_food(O_id,O_F_id,F_estimate) values "+" (?,?,?)";
		boolean o= insert(sql, O_id,F_id,F_estimate);
		return o;
	}

	@Override
	public boolean count(String O_id,String F_id,int count) {
		// TODO Auto-generated method stub
		String sql="insert into order_food(O_id,O_F_id,count) values "+" (?,?,?)";
		boolean o= insert(sql, O_id,F_id,count);
		return o;
	}

	@Override
	public Order_Food query(String O_id, String F_id) {
		// TODO Auto-generated method stub
		String sql="select *from order_food where O_id=?,F_id=?";
		return query(sql,O_id ,F_id);
	}

}
