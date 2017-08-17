package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.service_domain.Lincense_Bean;

public class lincense_Dao_impl extends BaseDao<Lincense_Bean> implements lincense_Dao{
	//插入执照信息
	@Override
	public boolean setLincenseInfo(Lincense_Bean lincense_bean) {
		// TODO Auto-generated method stub
		String sql="insert into lincense values"+" (?,?,?,?,?,?,?,?,?,?)";
		boolean l=insert(sql, lincense_bean.getC_lincense_id(),lincense_bean.getC_lincense_name(),lincense_bean.getC_lincense_date(),lincense_bean.getC_lincense_type(),lincense_bean.getC_lincense_picture(),lincense_bean.getC_legal_name(),lincense_bean.getC_legal_id(),lincense_bean.getC_legal_imgae(),lincense_bean.getC_id(),lincense_bean.getA_id());
		return l;
	}

	@Override
	//查询执照信息
	public Lincense_Bean getLincenseInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from lincense where C_id=? ";
		return query(sql, C_id);
	}
	//修改执照信息
	@Override
	public boolean changeLincenseInfo(Lincense_Bean lincense_bean) {
		// TODO Auto-generated method stub
		String sql="update lincense set C_lincense_name=? , C_lincense_date=? , C_lincensse_type=? , C_lincense_picture=? , C_legal_name=? , C_legal_id=? , C_legal_image=?";
		boolean l=update(sql, lincense_bean.getC_lincense_name(),lincense_bean.getC_lincense_date(),lincense_bean.getC_lincense_type(),lincense_bean.getC_lincense_picture(),lincense_bean.getC_legal_name(),lincense_bean.getC_legal_id(),lincense_bean.getC_legal_imgae());
		return l;
	}


}
