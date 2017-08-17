package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.service_domain.Canteen_Request_Bean;

public class C_Request_impl extends BaseDao<Canteen_Request_Bean> implements C_Request_Dao {

	@Override
	//查询所有申请单 完成
	public List<Canteen_Request_Bean> getAllRequestList() {
		// TODO Auto-generated method stub
		String sql="select * from canteen_request";
		return queryforList(sql, null);
	}
	//插入申请表 完成
	@Override
	public boolean setRequest(Canteen_Request_Bean canteen_Rquest_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into canteen_request values "+" (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		return insert(sql, canteen_Rquest_Bean.getCR_id(),canteen_Rquest_Bean.getC_check(),canteen_Rquest_Bean.getC_sign_check(),canteen_Rquest_Bean.getC_lincense_checck(),canteen_Rquest_Bean.getC_gathering_check(),canteen_Rquest_Bean.getPermission_check(),canteen_Rquest_Bean.getC_time(),canteen_Rquest_Bean.getC_id(),canteen_Rquest_Bean.getC_id(),canteen_Rquest_Bean.getC_sign_id(),canteen_Rquest_Bean.getC_lincense_id(),canteen_Rquest_Bean.getC_gathering_id(),canteen_Rquest_Bean.getC_permission_id(),canteen_Rquest_Bean.getManager());
	}

	@Override
	//查询商家的店铺申请 wancheng
	public Canteen_Request_Bean getReuqest(String B_id) {
		// TODO Auto-generated method stub
		String sql="select * from canteen_Request where B_id=?";
		return query(sql, B_id);
	}

	@Override
	//修改入驻申请 完成
	public boolean changeRequestList(Canteen_Request_Bean canteen_Rquest_Bean) {
		String sql="update canteen_Request set C_check=?,C_sign_check=?,C_lincense_check=?,C_gathering_id=?,C_permission_check=? where CR_id=?" ;
		boolean b=update(sql, canteen_Rquest_Bean.getC_check(),canteen_Rquest_Bean.getC_sign_check(),canteen_Rquest_Bean.getC_lincense_checck(),canteen_Rquest_Bean.getC_gathering_check(),canteen_Rquest_Bean.getPermission_check(),canteen_Rquest_Bean.getCR_id());
		return b;
		// TODO Auto-generated method stub
		
	}

	
}
