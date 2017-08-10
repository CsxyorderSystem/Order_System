package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Norm_Bean;

public interface Norms_Dao {
	//查询所有规格
	public List<Norm_Bean> getAllNorms();
	
	//更改菜品规格
	public void setNorm(Norm_Bean normBean);

}
