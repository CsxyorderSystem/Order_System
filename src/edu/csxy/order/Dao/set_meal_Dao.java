package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Set_meal_Bean;

import java.util.List;

import edu.csxy.order.service_domain.Set_meal_Bean;

public interface set_meal_Dao {
	
	//��ѯ�����òͼƻ�
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id);
	
	//��ѯ��λ�û��òͼƻ�
	public List<Set_meal_Bean> getTeamSet_meal(String T_id);
	
	//��ѯ�òͼƻ�����
	public Set_meal_Bean getSet_meal(int S_id);
	
	//����״̬��ѯ�����òͼƻ�
	public List<Set_meal_Bean> getCanteenSet_meal(String C_id,int S_state);
	
	//�������Ͳ�ѯ�����òͼƻ�
	public List<Set_meal_Bean> getCanteenSet_mealByType(String C_id,int S_type);
	
	//����״̬��ѯ��λ�òͼƻ�
	public  List<Set_meal_Bean> getTeamSet_meal(String T_id,int S_state);
	
	//�½��òͼƻ�
	public boolean setSet_meal(Set_meal_Bean set_meal_Bean); 
	
	//�޸ļ۸�
	public boolean changeSet_meal_price(int S_id,float S_price);
}
