package edu.csxy.order.service;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Person_Bean;

public class Person_service {
	personal_Dao person=new personal_Dao_impl();
	order_Dao order=new order_Dao_impl();
	business_Dao business=new business_Dao_impl();
	public void QueryOrder(int P_id){
		//��ѯ���и��˶���
	}
	public void QueryCanteen(int C_id){
		//��ѯ�����ڲ�Ʒ��Ϣ����ȫ����Ϣ
	}
	public void QueryAllOrder(){
		//��ѯ�������ж���
	}
	public void QueryAllCanteen(){
		//��ѯ���в����б�
	}
	public void PayOrder(){
		//��ѯ֧������
	}
	public Person_Bean ManagelInfo(){
		return null;
		//�޸ĸ�����Ϣ
	}
	public Order_Bean CreateOrder(){
		return null;
		//��������
	}
	public void EstlimateOrder(int P_id,int C_id,String Estlimate){
		//���۶���
	}
}
