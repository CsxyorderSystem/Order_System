package edu.csxy.order.Dao_impl;


import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.service_domain.User_Bean;

public class user_Dao_impl extends BaseDao<User_Bean> implements user_Dao {

	@Override
	public boolean changePassword(String U_phone, String U_password, String U_id) {
		// TODO Auto-generated method stub
		//改密码 已完成
		String sql="update user set U_password=? Where U_phone=? and U_id=? ";
		return update(sql, U_password,U_phone,U_id); 
	}

	@Override
	public String checkUser(String U_phone, String U_password) {
		//登录 已完成
		String sql= "select * from user where U_phone=? and U_password=?";//获取账号密码
		User_Bean user=query(sql,U_phone,U_password);
		return user.getU_id();
		// TODO Auto-generated method stub
	}

	@Override
	public boolean sign(String U_phone, String U_password, String U_id) {
		//注册用户  已完成
		String sql="insert into user values "+"(?,?,?)"; //插入注册操作，但需要先进行检查是否被注册
		// TODO Auto-generated method stub
		return  insert(sql,U_id,U_phone,U_password);
	}

	@Override
	public String alreadysign(String U_phone) {
		// TODO Auto-generated method stub
		//检查是否注册 已完成，返回注册的电话号码
		String sql="select * from user where U_phone=?";//进行查询注册操作
		query(sql, U_phone);
		User_Bean user=query(sql,U_phone);
		return user.getU_id();//若被注册，返回注册的id
	}


}
