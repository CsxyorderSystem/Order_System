package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Norm_Bean;

public interface norms_Dao {
	//��ѯ���й��
	public List<Norm_Bean> getAllNorms(int C_id);
	
	//���Ĳ�Ʒ���
	public boolean setNorm(Norm_Bean normBean);

}
