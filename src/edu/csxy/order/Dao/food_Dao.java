package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//��ѯ��Ʒ������Ϣ
	public Food_Bean getFoodInfo(int F_id);
	
	//��ѯ��ѡ���������в�Ʒ
	public List<Food_Bean> getAllFood(String C_id);
	
	//�½���Ʒ
	public boolean setFood(Food_Bean food_Bean);
	
	//�޸Ĳ�Ʒ��Ϣ
	public boolean ChangeFood(Food_Bean food_Bean);
	
	//ɾ����Ʒ
	public boolean deleteFood(String F_id);
	
	//�޸Ĳ�Ʒ����
	public boolean ChangeEstimate(String F_id,Float estimate);
	
	//
	
	
}
