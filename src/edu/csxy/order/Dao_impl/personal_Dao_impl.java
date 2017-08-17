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
	public Boolean setPersonInfo(Person_Bean person_Bean,String U_id) {
		//���������Ϣ
		String sql="insert into person values"+" (?,?)";
		insert(sql, person_Bean.getP_id(),U_id);
		// TODO Auto-generated method stub
		return null;
	}
	//��ȡ��¼
	@Override
	public Person_Bean getPersonalInfo(String U_id) {
		// TODO Auto-generated method stub
		String sql="select * from person where U_id=? ";
		return query(sql, U_id);
	}
	// ������޸ĸ�����Ϣ ȫ�����
	@Override
	public boolean changePersonInfo(Person_Bean person_Bean) {
		String sql=" update person set P_name=?,P_sex=? ,P_flavor=? where P_id=?";
		update(sql, person_Bean.getP_name(),person_Bean.getP_sex(),person_Bean.getP_flavor(),person_Bean.getP_id());
		// TODO Auto-generated method stub
		return false;
	}



}
