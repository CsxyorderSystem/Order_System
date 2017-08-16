package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.app_domain.Business_User;
import edu.csxy.order.service_domain.Business_Bean;
import edu.csxy.order.service_domain.User_Bean;

public class business_Dao_impl extends BaseDao<Business_Bean> implements business_Dao {

	//д���̼���Ϣ  ���
	public Boolean setBusinessInfo(Business_Bean Business_Bean,String U_id) {
		// TODO Auto-generated method stub
		String sql="insert into business values "+"(?,?,?,?) ";
		return insert(sql, Business_Bean.getB_id(),Business_Bean.getB_name(),Business_Bean.getB_phone(),U_id);
	}

	//��ѯ�̼���Ϣ	���
	@Override
	public Business_Bean getBusinessInfo(String B_id) {
		// TODO Auto-generated method stub
		String sql="select * from business where B_id=?";
		return query(sql, B_id);
	}	
	//��ȡ�̼���Ϣ	���
	@Override
	public Business_Bean getBusiness(String U_id) {
		// TODO Auto-generated method stub
		String sql="select * from business where U_id=?";
		return query(sql, U_id);
	}
	//�޸��̼���Ϣ ���
	@Override
	public boolean changeBusinessInfo(String B_id,String B_name,String B_phone) {
		String sql="update business set B_name=?,B_phone=? where B_id=?";
		// TODO Auto-generated method stub
		return update(sql, B_id,B_name,B_phone);
	}


}
