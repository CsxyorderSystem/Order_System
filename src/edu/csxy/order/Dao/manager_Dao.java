package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Request_Bean;

public interface manager_Dao {
	//��ѯ�̼���פ���뵥
	public List<Canteen_Request_Bean> getRequestList();
	
	//�����̼���פ���뵥
	public void changeRequestList(Canteen_Request_Bean Canteen_Rquest_Bean);
	
	

}
