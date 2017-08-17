package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.service_domain.Set_meal_Bean;

public class set_meal_Dao_impl extends BaseDao<Set_meal_Bean> implements set_meal_Dao{
	//查询餐厅得用餐计划
	@Override
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where C_id=?";
		return queryforList(sql, C_id);
	}
	//查询单位用户得用餐计划
	@Override
	public List<Set_meal_Bean> getTeamSet_meal(String T_id) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where T_id=?";
		return queryforList(sql, T_id);
	}
	//查询用餐计划内容
	@Override
	public Set_meal_Bean getSet_meal(String S_id,String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where S_id=? and C_id=?";
		return query(sql, S_id,C_id);
	}
//根据状态查询餐厅用餐计划
	@Override
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id, int S_state) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where C_id=? and S_state=?";
		return queryforList(sql, C_id,S_state);
	}
	//根据类型查询餐厅用餐计划
	@Override
	public List<Set_meal_Bean> getCanteenSet_mealByType(String C_id, int S_type) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where C_id=? and S_type=?";
		return queryforList(sql, C_id,S_type);
	}
	//根据状态查询单位用餐计划
	@Override
	public List<Set_meal_Bean> getTeamSet_meal(String T_id, int S_state) {
		// TODO Auto-generated method stub
		String sql="select * from setmeal where T_id=? and S_state";
		return queryforList(sql, T_id,S_state);
	}
	//新建用餐计划
	@Override
	public boolean setSet_meal(Set_meal_Bean set_meal_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into setmeal(S_id,S_price,S_describe,S_uptime,S_type,S_state,S_starttime,S_endtime,C_id,T_id,S_name) "+" (?,?,?,?,?,?,?,?,?,?,?)";
		boolean s= insert(sql, set_meal_Bean.getS_id(),set_meal_Bean.getS_price(),set_meal_Bean.getS_uptime(),set_meal_Bean.getS_type(),set_meal_Bean.getS_state(),set_meal_Bean.getS_starttime(),set_meal_Bean.getS_endtime(),set_meal_Bean.getC_id(),set_meal_Bean.getT_id(),set_meal_Bean.getS_name());
		return s;
	}
	//修改价格
	@Override
	public boolean changeSet_meal_price(String S_id, float S_price) {
		// TODO Auto-generated method stub
		String sql="update setmeal set S_price=? where S_id=?";
		return update(sql, S_price,S_id);
	}
	

	
}
