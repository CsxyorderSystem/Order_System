package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Business_Bean;

public interface business_Dao {
	//д���̼���Ϣ
	public List<Business_Bean> setBusinessInfo(Business_Bean Business_Bean);

	//��ѯ�̼��û���Ϣ
	public List<Business_Bean> getBusinessInfo(int B_id);
	//��ȡ�̼ҵ�¼��Ϣ
	public List<Business_Bean> getBusiness(int U_id);

	
}
