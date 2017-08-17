package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//查询个人用户信息
	public Person_Bean getPersonInfo(String P_id);

	//charu个人信息
	public Boolean setPersonInfo(Person_Bean person_Bean,String U_id);
	//获取个人登录信息
	public Person_Bean getPersonalInfo(String U_id);
	//更新个人信息
	public boolean changePersonInfo(Person_Bean person_Bean);
}
