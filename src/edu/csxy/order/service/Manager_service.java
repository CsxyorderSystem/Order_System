package edu.csxy.order.service;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.manager_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.manager_Dao_impl;

public class Manager_service {
	manager_Dao manager=new manager_Dao_impl();
	C_Request_Dao c_Request=new C_Request_impl();
	public void CheakRequest(int CR_id) {
		//��ѯ�̼���פ����
	}
	public void ChangeRequest(int CR_id,int C_check){
		//�����̼���פ����
	}
	public void CheckPromotionRequest(int PR_id){
		//��ѯ�ƹ�����
	}
	public void ChangePromotionRequest(int PR_id){
		//�����ƹ�����״̬
	}
	public void ReleasePromotion(){
		//��������ʲô��
	}
}
