package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Lincense_Bean;

public interface lincense_Dao {
	//д��ִ����Ϣ
	public void setLincenseInfo(Lincense_Bean lincense_bean);
	
	//��ѯִ����Ϣ
	public Lincense_Bean getLincenseInfo(int C_id);

}
