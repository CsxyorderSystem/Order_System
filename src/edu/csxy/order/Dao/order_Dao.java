package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//��������
	public boolean AddOrder(Order_Bean order_Bean);
	
	//����״̬�޸�
	public boolean changeOrderState(int O_id,String O_state);
	//�޸Ķ����۸�
	public boolean changeOrderPrice(float price);
	
	//��ѯ������Ϣ
	public List<Order_Bean> getOrderInfo(int O_id);
	
	//��ѯ���в���������Ϣ
	public List<Order_Bean> getCanteenOrderInfo(String C_id);
	
	//��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonOrderInfo(String P_id);
	
	//��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamOrderInfo(String T_id);
	
	//��ѯ���ͼƻ����������Ķ���
	public List<Order_Bean> getSetMealOrderInfo(int S_id);
	
	//����״̬��ѯ���в���������Ϣ
	public List<Order_Bean> getCanteenOrderInfo(String C_id,String state);
	
	//����״̬��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonOrderInfo(String P_id,String state);
	
	//����״̬��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamOrderInfo(String T_id,String state);
	
	//����״̬��ѯ�ƻ��������Ķ���
	public List<Order_Bean> getSetMealOrderInfo(int S_id,String state);
}
