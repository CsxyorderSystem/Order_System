package edu.csxy.order.Dao;

public interface user_Dao {
		//修改密码
		public boolean changePassword(String U_phone,String U_password,String U_id);
		//检查账号登录是否成功,若成功返回U_id，否则返回空值
		public String checkUser(String U_phone,String U_password);
		//账号注册
		public boolean sign(String U_phone,String U_password,String U_id);
		//检查账号是否被注册，若被注册则返回U_id，否则返回空值
		public String alreadysign(String U_phone);
}
