package edu.csxy.order.Dao;

public interface user_Dao {
		//�޸�����
		public boolean changePassword(String U_phone,String U_password,String U_id);
		//����˺ŵ�¼�Ƿ�ɹ�,���ɹ�����U_id�����򷵻ؿ�ֵ
		public String checkUser(String U_phone,String U_password);
		//�˺�ע��
		public boolean sign(String U_phone,String U_password,String U_id);
		//����˺��Ƿ�ע�ᣬ����ע���򷵻�U_id�����򷵻ؿ�ֵ
		public String alreadysign(String U_phone);
}
