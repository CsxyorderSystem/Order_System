package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Sign_Bean;

public interface sign_Dao {
	//写入签约人信息
	public boolean setSignInfo(Sign_Bean sign_Bean);
	
	//查询签约人信息
	public Sign_Bean getSignInfo(String C_id);

}
