package edu.csxy.order.Dao;

public interface order_set_meal_Dao {
	//�����ײ�����
		public boolean setsetmealestimate(int O_id,int S_id);
		//�����ײ͵���Ŀ
		public boolean count(int O_id,int S_id);
		//ѡȡ�ò���Ա
		public Boolean setOSMperson(int O_id,int T_id);
		//��ȡ��λ�ò�����
		public String getOSMnumber(int O_id,int T_id);
}
