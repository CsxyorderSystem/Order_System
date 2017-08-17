package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Canteen_Bean;

public interface canteen_Dao {
	//查询店铺信息
	public Canteen_Bean getCanteenInfo(String C_id);
	//新增店铺
	public boolean addCanteen(Canteen_Bean Canteen_Bean);
	//查询所有店铺
	public List<Canteen_Bean> getCanteen();
	//计算评分
	//加钱到余额，先不做
	//查余额
	public Float getBalance(String C_id);
}
