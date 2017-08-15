package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Gathering_Bean;

public interface gathering_Dao {
	//查询收款人信息
	public Gathering_Bean getGatherInfo(String C_id);
	
	//写入收款人信息
	public boolean setGatheringInfo(Gathering_Bean gathering_Bean);

}
