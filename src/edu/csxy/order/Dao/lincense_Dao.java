package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Lincense_Bean;

public interface lincense_Dao {
	//写入执照信息
	public void setLincenseInfo(Lincense_Bean lincense_bean);
	
	//查询执照信息
	public Lincense_Bean getLincenseInfo(int C_id);

}
