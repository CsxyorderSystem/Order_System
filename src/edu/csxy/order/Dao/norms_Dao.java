package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Norm_Bean;

public interface norms_Dao {
	//查询所有规格
	public List<Norm_Bean> getAllNorms(int C_id);
	
	//更改菜品规格
	public boolean setNorm(Norm_Bean normBean);

}
