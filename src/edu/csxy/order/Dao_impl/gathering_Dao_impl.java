package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.service_domain.Gathering_Bean;

public class gathering_Dao_impl extends BaseDao<Gathering_Bean> implements gathering_Dao {
	//查询收款人姓名
	@Override
	public String getGatherInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select C_gathering_name from gathering where C_id=?";
		Gathering_Bean g = query(sql, C_id);
		if(g==null){
			return "";
		}
		else{
		return g.getC_gathering_name();}
	}
	//插入收款人信息
	@Override
	public boolean setGatheringInfo(Gathering_Bean gathering_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into gathering values "+" (?,?,?,?,?,?)";
		boolean g=insert(sql, gathering_Bean.getC_gathering_type(),gathering_Bean.getC_gathering_name(),gathering_Bean.getC_gathering_card(),gathering_Bean.getC_gathering_bank(),gathering_Bean.getC_gathering_branch(),gathering_Bean.getC_id());
		return g;
	}
	//修改收款人信息
	@Override
	public boolean changeGatheringInfo(Gathering_Bean gathering_Bean) {
		// TODO Auto-generated method stub
		String sql="update gathering set C_gathering_type=? , C_gathering_name=? , C_gathering_card=?,C_gathering_bank=? , C_gathering_branch=?";
		boolean g=	update(sql, gathering_Bean.getC_gathering_type(),gathering_Bean.getC_gathering_name(),gathering_Bean.getC_gathering_card(),gathering_Bean.getC_gathering_bank(),gathering_Bean.getC_gathering_branch());	
		return g;
	}


}
