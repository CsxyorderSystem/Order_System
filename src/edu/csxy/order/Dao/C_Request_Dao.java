package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Request_Bean;

public interface C_Request_Dao {
	    //��ѯ�����̼���פ���뵥
		public List<Canteen_Request_Bean> getAllRequestList();
		
		//�ύ���뵥
		public boolean setRequest(Canteen_Request_Bean canteen_Rquest_Bean,String B_id,String C_id);
		
		//��ѯָ���̼������
		public Canteen_Request_Bean getReuqest(String B_id);

		//�����̼���פ���뵥
		public boolean changeRequestList(Canteen_Request_Bean canteen_Rquest_Bean);
		
}
