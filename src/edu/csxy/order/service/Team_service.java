package edu.csxy.order.service;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.service_domain.Order_Bean;


public class Team_service {
	team_Dao person=new team_Dao_impl();
	order_Dao order=new order_Dao_impl();
	business_Dao business=new business_Dao_impl();
	public void QueryAllCanteen(){
		//��ѯ���в���
	}
	public void QueryCanteen(int C_id){
		//��ѯ������Ϣ
	}
	public void QueryAllOrder(){
		//��ѯ���ж���
	}
	public void QueryOrder(int T_id){
		//��ѯ���˶���
	}
	public Order_Bean CreateOrder(){
		return null;
		//��������
	} 
	public void PayOrder(){
		//֧������
	}
	public team_Dao ManagerInfo(){
		return person;
		//����λ��Ϣ
	}
	public void EstimateOrder(int T_id,int O_id,int C_id,String Estlimate){
		//���۶���
	}
}
