package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.FoodType_Bean;

public interface foodtype_Dao {
	public String getFoodTypeName(int FT_id);//��ȡ��Ʒ��������
	public boolean setFoodTypeName(FoodType_Bean foodType_Bean);//���ò�Ʒ����
	
}
