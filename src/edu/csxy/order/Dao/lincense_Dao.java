package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Lincense_Bean;

public interface lincense_Dao {
	//д��ִ����Ϣ
	public boolean setLincenseInfo(Lincense_Bean lincense_bean);
	
	//��ѯִ����Ϣ
	public Lincense_Bean getLincenseInfo(String C_id);

}
