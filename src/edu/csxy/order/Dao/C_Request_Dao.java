package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Request_Bean;

public interface C_Request_Dao {
	    //��ѯ�����̼���פ���뵥
		public List<Canteen_Request_Bean> getRequestList();
		
		//�ύ���뵥
		public void AddRequest(Canteen_Request_Bean canteen_Rquest_Bean);
		
		//��ѯָ���̼������
		public Canteen_Request_Bean get(int id);

		//�����̼���פ���뵥
		public void changeRequestList(Canteen_Request_Bean canteen_Rquest_Bean,int CR_id);
		
}
