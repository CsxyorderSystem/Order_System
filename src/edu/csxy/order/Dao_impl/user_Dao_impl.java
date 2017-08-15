package edu.csxy.order.Dao_impl;


import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.service_domain.User_Bean;

public class user_Dao_impl extends BaseDao<User_Bean> implements user_Dao {

	@Override
	public boolean changePassword(String U_phone, String U_password, String U_id) {
		// TODO Auto-generated method stub
		//改密码
		String sql="update user set U_password=? Where U_phone=? and U_id=? ";
		update(sql, U_password,U_phone,U_id);
		return true;
	}

	@Override
	public String checkUser(String U_phone, String U_password) {
		//登录
		User_Bean user=new User_Bean();
		String sql= "select * from user where U_phone=? and U_password=?";//获取账号密码
		query(sql,U_phone,U_password);
		String U_id=user.getU_id();
		// TODO Auto-generated method stub
		return U_id;
	}

	@Override
	public boolean sign(String U_phone, String U_password, String U_id) {
		//注册用户
		String sql="insert into user values "+"(?,?,?)"; //插入注册操作，但需要先进行检查是否被注册
		insert(sql,U_phone,U_password,U_id);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String alreadysign(String U_phone) {
		// TODO Auto-generated method stub
		//检查是否注册
		User_Bean user=new User_Bean();//获取bean的内容
		String sql="select * from user where U_phone=?";//进行查询注册操作
		query(sql, U_phone);
		return user.getU_id();//若被注册，返回U_id
	}


}
