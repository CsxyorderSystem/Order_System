package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.service_domain.Order_Bean;

public class order_Dao_impl extends BaseDao<Order_Bean> implements order_Dao {
	//��������
	@Override
	public boolean AddOrder(Order_Bean order_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into order(O_id,O_time,O_price,O_purchase,O_state) "+"(?,?,?,?,?)";
		boolean o=insert(sql, order_Bean.getO_id(),order_Bean.getO_time(),order_Bean.getO_price(),order_Bean.getO_purchase(),order_Bean.getO_state());
		return o;
	}
	//����״̬�޸�
	@Override
	public boolean changeOrderState(String O_id, String O_state) {
		String sql="update order set O_state=? where O_id=?";
		// TODO Auto-generated method stub
		boolean o=update(sql, O_state,O_id);
		return o;
	}
	//�޸Ķ����۸�
	@Override
	public boolean changeOrderPrice(String O_id,float O_price) {
		// TODO Auto-generated method stub
		String sql="update order set O_price=? where O_id=?";
		return update(sql, O_price,O_id);
	}
	//�鿴������Ϣ
	@Override
	public Order_Bean getOrderInfo(String O_id) {
		// TODO Auto-generated method stub
		String sql="select * from order where O_id=?";
		return query(sql, O_id);
	}
	//�鿴�������ж�����Ϣ???????
	@Override
	public List<Order_Bean> getCanteenOrderInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from order where C_id=?";
		return queryforList(sql, C_id);
	}
	//�鿴���˵����ж���
	@Override
	public List<Order_Bean> getPersonOrderInfo(String P_id) {
		// TODO Auto-generated method stub
		String sql="select * from order,person_order_canteen where ";
		return null;
	}
	//�鿴�Ŷӵ����ж���
	@Override
	public List<Order_Bean> getTeamOrderInfo(String T_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getSetMealOrderInfo(String S_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getCanteenOrderInfo(String C_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getPersonOrderInfo(String P_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getTeamOrderInfo(String T_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order_Bean> getSetMealOrderInfo(String S_id, String state) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getid(String O_id) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
