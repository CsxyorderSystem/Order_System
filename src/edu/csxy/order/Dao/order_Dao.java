package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//��������
	public void AddOrder(Order_Bean order_Bean);
	
	//����״̬�޸�
	public void changeOrderState(int O_id,String O_state);
	
	//��ѯ������Ϣ
	public Order_Bean getOrderInfo(int O_id);
	
	//��ѯ���ж�����Ϣ
	public List<Order_Bean> getAllOrderInfo();
}
