package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.FoodType_Bean;

public interface foodtype_Dao {
	public String getFoodTypeName(String FT_id);//��ȡ��Ʒ��������
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean);//���ò�Ʒ����
	public List<FoodType_Bean> getfoodtype(String C_id);//�����̼һ�ȡlist
	//ɾ�����
	//�޸����
	
}
