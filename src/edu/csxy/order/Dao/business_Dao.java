package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Business_Bean;

public interface business_Dao {
	//д���̼���Ϣ
	public Boolean setBusinessInfo(Business_Bean Business_Bean,String U_id);

	//��ѯ�̼��û���Ϣ
	public Business_Bean getBusinessInfo(String B_id);
	//��ȡ�̼ҵ�¼��Ϣ
	public Business_Bean getBusiness(String U_id);
	//�޸��̼���Ϣ
	public boolean changeBusinessInfo(String B_id,String B_name,String B_phone);
	
}
