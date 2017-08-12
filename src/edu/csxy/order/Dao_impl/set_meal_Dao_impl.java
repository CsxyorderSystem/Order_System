package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.service_domain.Set_meal_Bean;

public class set_meal_Dao_impl extends BaseDao<Set_meal_Bean> implements set_meal_Dao{

	
	public List<Set_meal_Bean> getCanteenSet_meal(int C_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Set_meal_Bean> getTeamSet_meal(int T_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set_meal_Bean getSet_meal(int S_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Set_meal_Bean> getCanteenSet_meal(int C_id, int S_state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Set_meal_Bean> getCanteenSet_mealByType(int C_id, int S_type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Set_meal_Bean> getTeamSet_meal(int T_id, int S_state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSet_meal(Set_meal_Bean set_meal_Bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeSet_meal_price(int S_id, float S_price) {
		// TODO Auto-generated method stub
		
	}


}
