package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.service_domain.Food_Bean;

public class food_Dao_impl extends BaseDao<Food_Bean> implements food_Dao {

	@Override
	public Food_Bean getFoodInfo(int F_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food_Bean> getAllFood(int C_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setFood(Food_Bean food_Bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ChangeFood(Food_Bean food_Bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFood(int F_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ChangeEstimate(int F_id, Float estimate) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
