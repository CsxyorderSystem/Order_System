package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Set_meal_Bean;

public interface set_meal_Dao {
	//��ȡ������ȫ���òͼƻ�
	public Set_meal_Bean getCantennSet_meal(int C_id);
	//��ȡ��λ�òͼƻ�
	public Set_meal_Bean getTeamSet_meal(int T_id);
	//��ȡ
}
