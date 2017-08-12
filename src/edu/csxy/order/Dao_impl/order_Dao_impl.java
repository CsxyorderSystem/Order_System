package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.service_domain.Order_Bean;

public class order_Dao_impl extends BaseDao<Order_Bean> implements order_Dao {

	@Override
	public void AddOrder(Order_Bean order_Bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeOrderState(int O_id, String O_state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order_Bean getOrderInfo(int O_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getPersonAllOrderInfo(int P_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getTeamAllOrderInfo(int T_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getPersonAllOrderInfo(int P_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getTeamAllOrderInfo(int T_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

}
