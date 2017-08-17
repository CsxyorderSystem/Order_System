package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.service_domain.Sign_Bean;

public class sign_Dao_impl extends BaseDao<Sign_Bean> implements sign_Dao {
	//写入签约人信息
	@Override
	public boolean setSignInfo(Sign_Bean sign_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into sign values"+" (?,?,?,?,?,?)";
		boolean s=insert(sql, sign_Bean.getC_sign_name(),sign_Bean.getC_sign_id(),sign_Bean.getC_sign_bank(),sign_Bean.getC_sign_card(),sign_Bean.getC_sign_phone(),sign_Bean.getC_id());
		return s;
	}
	//获取签约人信息
	@Override
	public Sign_Bean getSignInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from sign where C_id=?";
		return query(sql, C_id);
	}
	//修改签约人信息
	@Override
	public boolean changeSignInfo(Sign_Bean sign_Bean) {
		// TODO Auto-generated method stub
		String sql="update sign set C_sign_name=?,C_sign_bank=? ,C_sign_card=? ,C_sign_phone=?";
		boolean n=update(sql, sign_Bean.getC_sign_name(),sign_Bean.getC_sign_bank(),sign_Bean.getC_sign_card(),sign_Bean.getC_sign_phone());
		return n;
	}



}
