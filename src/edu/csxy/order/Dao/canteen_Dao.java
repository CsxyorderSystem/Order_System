package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Bean;

public interface canteen_Dao {
	//��ѯ������Ϣ
	public List<Canteen_Bean> getCanteenInfo(int C_id);
	//��������
	public boolean addCanteen(Canteen_Bean Canteen_Bean);

}
