package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Order_Food;

public interface order_food_Dao {
	//���ò�Ʒ����
	public boolean setFoodestimate(String O_id,String F_id,float F_estimate);
	//������Ʒ����Ŀ
	public boolean count(String O_id,String F_id,int count);
	//�鿴������Ʒ��Ŀ������
	public Order_Food query(String O_id,String F_id);
}
