package edu.csxy.order.service;

import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.manager_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.manager_Dao_impl;
import edu.csxy.order.app_domain.Canteen_Request;

public class Manager_service {
	manager_Dao manager=new manager_Dao_impl();
	C_Request_Dao c_Request=new C_Request_impl();
	public Canteen_Request CheakRequest(int CR_id) {
		return null;
		//��ѯ�̼���פ����
	}
	public List<Canteen_Request> CheakRequest(String State){
		return null;
		//����״̬��ѯ�̼���פ����
	}
	public boolean ChangeRequest(int CR_id,int C_check){
		return false;
		//�����̼���פ����
	}
	public void CheckPromotionRequest(int PR_id){
		//��ѯ�ƹ�����
	}
	public void ChangePromotionRequest(int PR_id){
		//�����ƹ�����״̬
	}
	public void ReleasePromotion(){
		//�����ƹ�
	}
}
