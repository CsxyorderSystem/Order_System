package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Norm_Bean;

public interface Norms_Dao {
	//��ѯ���й��
	public List<Norm_Bean> getAllNorms();
	
	//���Ĳ�Ʒ���
	public void setNorm(Norm_Bean normBean);

}
