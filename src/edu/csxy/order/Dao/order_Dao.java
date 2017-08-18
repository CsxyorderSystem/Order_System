package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;

public interface order_Dao {
	//��������
	public boolean AddOrder(Order_Bean order_Bean);
	
	//����״̬�޸�
	public boolean changeOrderState(String O_id,String O_state);
	//�޸Ķ����۸�
	public boolean changeOrderPrice(String O_id,float O_price);
	
	//��ѯ������Ϣ
	public Order_Bean getOrderInfo(String O_id);
	
	//��ѯ�������ж�����Ϣ
	public List<Order_Bean> getCanteenOrderInfo(String C_id);
	
	//��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonOrderInfo(String P_id);
	
	//��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamOrderInfo(String T_id);
	
	//��ѯ���ͼƻ����������Ķ���
	public List<Order_Bean> getSetMealOrderInfo(String S_id);
	
	//����״̬��ѯ���в���������Ϣ
	public List<Order_Bean> getCanteenOrderInfo(String C_id,String O_state);
	
	//����״̬��ѯ���и��˶�����Ϣ
	public List<Order_Bean> getPersonOrderInfo(String P_id,String O_state);
	
	//����״̬��ѯ���е�λ������Ϣ
	public List<Order_Bean> getTeamOrderInfo(String T_id,String O_state);
	
	//����״̬��ѯ�ƻ��������Ķ���
	public List<Order_Bean> getSetMealOrderInfo(String S_id,String O_state);
	//���ݶ����Ż�ȡPid
	public String getPid(String O_id);
	//���ݶ�������U����id
	public String getTid(String O_id);
}
