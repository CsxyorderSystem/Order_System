package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Norm_Bean;

public interface norms_Dao {
	//��ѯ���й��
	public List<Norm_Bean> getAllNorms(String C_id);
	
	//���Ĳ�Ʒ���
	public boolean setNorm(Norm_Bean norm_Bean);
	//�����Ʒ���
	public boolean NormInfo(Norm_Bean norm_Bean);
	// �ò�Ʒ������LIST
	public List<Norm_Bean> queryList(String F_id);
}
