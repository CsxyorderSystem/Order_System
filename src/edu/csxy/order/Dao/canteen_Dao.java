package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Bean;

public interface canteen_Dao {
	//查询店铺信息
	public List<Canteen_Bean> getCanteenInfo(int C_id);
	//新增店铺
	public boolean addCanteen(Canteen_Bean Canteen_Bean);

}
