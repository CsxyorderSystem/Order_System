package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Gathering_Bean;

public interface gathering_Dao {
	//��ѯ�տ�����Ϣ
	public String getGatherInfo(String C_id);
	
	//д���տ�����Ϣ
	public boolean setGatheringInfo(Gathering_Bean gathering_Bean);
	//�޸��տ�����Ϣ
	public boolean changeGatheringInfo(Gathering_Bean gathering_Bean);
}
