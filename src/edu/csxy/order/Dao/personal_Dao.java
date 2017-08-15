package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//查询个人用户信息
	public List<Person_Bean> getPersonInfo(String P_id);

	//更新个人信息
	public Boolean setPersonInfo(Person_Bean person_Bean);
	//获取个人登录信息
	public boolean getPersonalInfo(String U_id);
}
