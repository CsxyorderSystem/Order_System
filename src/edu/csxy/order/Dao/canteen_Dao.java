package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Bean;

public interface canteen_Dao {
	//��ѯ������Ϣ
	public Canteen_Bean getCanteenInfo(String C_id);
	//��������
	public boolean addCanteen(Canteen_Bean Canteen_Bean);
	//��ѯ���е���
	public List<Canteen_Bean> getCanteen();
	//��������
	//��Ǯ�����Ȳ���
	//�����
	public Float getBalance(String C_id);
}
