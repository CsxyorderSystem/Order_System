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
	
	//��ѯ���в���������Ϣ
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id);
	
	//��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonAllOrderInfo(int P_id);
	
	//��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamAllOrderInfo(int T_id);
	
	//��ѯ���ͼƻ����������Ķ���
	public List<Order_Bean> getSetMealAllOrderInfo(int S_id);
	
	//����״̬��ѯ���в���������Ϣ
	public List<Order_Bean> getCanteenAllOrderInfo(int C_id,String state);
	
	//����״̬��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonAllOrderInfo(int P_id,String state);
	
	//����״̬��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamAllOrderInfo(int T_id,String state);
	
	//����״̬��ѯ�ƻ��������Ķ���
	public List<Order_Bean> getSetMealAllOrderInfo(int S_id,String state);
}
