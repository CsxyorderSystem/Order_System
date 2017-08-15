package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Lincense_Bean;

public interface lincense_Dao {
	//写入执照信息
	public boolean setLincenseInfo(Lincense_Bean lincense_bean);
	
	//查询执照信息
	public Lincense_Bean getLincenseInfo(String C_id);

}
