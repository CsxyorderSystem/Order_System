package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.service_domain.User_Bean;

public class user_Dao_impl extends BaseDao<User_Bean> implements user_Dao {

	@Override
	public boolean changePassword(String U_phone, String U_password, String U_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String checkUser(String U_phone, String U_password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sign(String U_phone, String U_password, String U_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String alreadysign(String U_phone) {
		// TODO Auto-generated method stub
		return null;
	}


}
