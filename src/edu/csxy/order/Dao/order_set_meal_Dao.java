package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_set_meal;

public interface order_set_meal_Dao {
		//�����ײ�����
		public boolean setsetmealestimate(String O_id,String S_id,float S_estimate);
		//�����ײ͵���Ŀ
		public boolean count(String O_id,String S_id,int count);
		//�鿴�ö�����Ϣ
		public List<Order_set_meal> setOSMperson(String O_id,String T_id);
		//���뵥λ�ò�����
		public boolean getOSMnumber(String O_id,String T_id,String OSM_person);
}
