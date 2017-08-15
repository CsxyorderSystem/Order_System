package edu.csxy.order.Dao;

public interface user_Dao {
		//ĞŞ¸ÄÃÜÂë
		public boolean changePassword(String U_phone,String U_password,String U_id);
		//¼ì²éÕËºÅµÇÂ¼ÊÇ·ñ³É¹¦
		public boolean checkUser(String U_phone,String U_password,String U_id);
		//ÕËºÅ×¢²á
		public boolean sign(String U_phone,String U_password,String U_id);
		//¼ì²éÕËºÅÊÇ·ñ±»×¢²á
		public boolean alreadysign(String U_phone,String U_id);
}
