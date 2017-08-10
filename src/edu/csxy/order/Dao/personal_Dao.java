package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//查询个人用户信息
	public Person_Bean getPersonInfo(int P_id);

	//更新个人信息
	public void setPersonInfo(Person_Bean Person_Bean);
}
