package edu.csxy.order.Dao;

public interface user_Dao {
		//�޸�����
		public boolean changePassword(String U_phone,String U_password,int U_id);
		//����˺ŵ�¼�Ƿ�ɹ�
		public boolean checkUser(String U_phone,String U_password,int U_id);
		//�˺�ע��
		public boolean sign(String U_phone,String U_password);
		//����˺��Ƿ�ע��
		public boolean alreadysign(String U_phone,int U_id);
}
