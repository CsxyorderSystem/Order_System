package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.service_domain.Canteen_Bean;

public class canteen_Dao_impl extends BaseDao<Canteen_Bean> implements canteen_Dao {
	//查询店铺信息ok
	@Override
	public Canteen_Bean getCanteenInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from canteen where C_id=?";
		return query(sql, C_id);
	}
	//新增店铺
	@Override
	public boolean addCanteen(Canteen_Bean Canteen_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into canteen(C_id,C_name,C_type,C_scope,C_contacts,C_phone,C_logo,C_surface,C_environment,C_open,A_id) values "+" (?,?,?,?,?,?,?,?,?,?,?)";
		boolean c=insert(sql, Canteen_Bean.getC_id(),Canteen_Bean.getC_type(),Canteen_Bean.getC_scope(),Canteen_Bean.getC_contacts(),Canteen_Bean.getC_phone(),Canteen_Bean.getC_logo(),Canteen_Bean.getC_surface(),Canteen_Bean.getC_environment(),Canteen_Bean.getC_open(),Canteen_Bean.getA_id());
		return c;
	}
	//查询所有店铺 ok
	@Override
	public List<Canteen_Bean> getCanteen() {
		String sql="select * from canteen ";
		// TODO Auto-generated method stub
		return queryforList(sql, null);
	}
	//查询余额
	@Override
	public Float getBalance(String C_id) {
		// TODO Auto-generated method stub
		String sql="select C_balance from canteen where C_id=?";
		Canteen_Bean canteen_Bean= query(sql, C_id);
		return canteen_Bean.getC_balance();
	}
	

}
