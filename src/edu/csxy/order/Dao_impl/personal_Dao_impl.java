package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.service_domain.Person_Bean;

public class personal_Dao_impl extends BaseDao<Person_Bean> implements personal_Dao {

	@Override
	public Person_Bean getPersonInfo(String P_id) {
		//��ȡ������Ϣ
		String sql = "select * from person where P_id = ?";
		return query(sql, P_id);
		// TODO Auto-generated method stub
	}

	@Override
	public Boolean setPersonInfo(Person_Bean person_Bean) {
		//�޸ĸ�����Ϣ
		String flavor=person_Bean.getP_flavor();	
		String name=person_Bean.getP_name();
		String sex=person_Bean.getP_sex();
		String sql="";
		update(sql, person_Bean);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getPersonalInfo(String U_id) {
		// TODO Auto-generated method stub
		return false;
	}



}
