package edu.csxy.order.Dao_impl;

import java.util.List;


import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.service_domain.Norm_Bean;

public class Norms_Dao_impl extends BaseDao<Norm_Bean> implements norms_Dao {

	@Override
	//查询
	public List<Norm_Bean> getAllNorms(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from norms where C_id=?";
		return queryforList(sql, C_id);
	}
	//更改 
	@Override
	public boolean setNorm(Norm_Bean norm_Bean) {
		// TODO Auto-generated method stub
		String sql="update norms set N_name=? ,N_type=?,N_price=? where N_id=?";
		boolean n=update(sql, norm_Bean.getN_name(),norm_Bean.getN_type(),norm_Bean.getN_price(),norm_Bean.getN_id());
		return n;
	}
	//插入
	@Override
	public boolean NormInfo(Norm_Bean norm_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into norms values "+" (?,?,?,?,?)";
		boolean n=insert(sql, norm_Bean.getN_id(),norm_Bean.getN_name(),norm_Bean.getN_type(),norm_Bean.getN_price(),norm_Bean.getC_id());
		return n;
	}


	
}
