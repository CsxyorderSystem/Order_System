package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;

public interface food_Dao {
	//��ѯ��Ʒ������Ϣ
	public Food_Bean getFoodInfo(int F_id);
	
	//��ѯ��ѡ���������в�Ʒ
	public List<Food_Bean> getAllFood(int C_id);
	
	//�½���Ʒ
	public void setFood(Food_Bean food_Bean);
	
	//�޸Ĳ�Ʒ��Ϣ
	public void ChangeFood(Food_Bean food_Bean);
	
	//ɾ����Ʒ
	public void deleteFood(int F_id);
	
	//�޸Ĳ�Ʒ����
	public void ChangeEstimate(int F_id,Float estimate);
	
	//
	
	
}
