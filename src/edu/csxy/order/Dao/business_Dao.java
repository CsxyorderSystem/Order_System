package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Business_Bean;

public interface business_Dao {
	//д���̼���Ϣ
	public void setBusinessInfo(Business_Bean Business_Bean);

	//��ѯ�̼��û���Ϣ
	public Business_Bean getBusinessInfo(int B_id);
	
	
}
