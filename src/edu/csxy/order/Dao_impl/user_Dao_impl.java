package edu.csxy.order.Dao_impl;


import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.service_domain.User_Bean;

public class user_Dao_impl extends BaseDao<User_Bean> implements user_Dao {

	@Override
	public boolean changePassword(String U_phone, String U_password, String U_id) {
		// TODO Auto-generated method stub
		//������ �����
		String sql="update user set U_password=? Where U_phone=? and U_id=? ";
		return update(sql, U_password,U_phone,U_id); 
	}

	@Override
	public String checkUser(String U_phone, String U_password) {
		//��¼ �����
		String sql= "select * from user where U_phone=? and U_password=?";//��ȡ�˺�����
		User_Bean user=query(sql,U_phone,U_password);
		return user.getU_id();
		// TODO Auto-generated method stub
	}

	@Override
	public boolean sign(String U_phone, String U_password, String U_id) {
		//ע���û�  �����
		String sql="insert into user values "+"(?,?,?)"; //����ע�����������Ҫ�Ƚ��м���Ƿ�ע��
		// TODO Auto-generated method stub
		return  insert(sql,U_id,U_phone,U_password);
	}

	@Override
	public String alreadysign(String U_phone) {
		// TODO Auto-generated method stub
		//����Ƿ�ע�� ����ɣ�����ע��ĵ绰����
		String sql="select * from user where U_phone=?";//���в�ѯע�����
		query(sql, U_phone);
		User_Bean user=query(sql,U_phone);
		return user.getU_id();//����ע�ᣬ����ע���id
	}


}
