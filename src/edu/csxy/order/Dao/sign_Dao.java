package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Sign_Bean;

public interface sign_Dao {
	//д��ǩԼ����Ϣ
	public boolean setSignInfo(Sign_Bean sign_Bean);
	
	//��ѯǩԼ����Ϣ
	public Sign_Bean getSignInfo(String C_id);

}
