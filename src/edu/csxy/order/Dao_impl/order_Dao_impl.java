package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.service_domain.Order_Bean;

public class order_Dao_impl extends BaseDao<Order_Bean> implements order_Dao {

	@Override
	public boolean AddOrder(Order_Bean order_Bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeOrderState(int O_id, String O_state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeOrderPrice(float price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order_Bean> getOrderInfo(int O_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getCanteenOrderInfo(int C_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getPersonOrderInfo(int P_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getTeamOrderInfo(int T_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getSetMealOrderInfo(int S_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getCanteenOrderInfo(int C_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getPersonOrderInfo(int P_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getTeamOrderInfo(int T_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getSetMealOrderInfo(int S_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
