package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//��ѯ��Ʒ������Ϣ
	public List<Food_Bean> getFoodInfo(int F_id);
	
	//��ѯ���в�Ʒ
	public List<Food_Bean> getAllFodd();
	
	//�½���Ʒ

}
