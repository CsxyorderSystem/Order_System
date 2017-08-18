package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.service_domain.Gathering_Bean;

public class gathering_Dao_impl extends BaseDao<Gathering_Bean> implements gathering_Dao {
	//��ѯ�տ�������
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
	//�����տ�����Ϣ
	@Override
	public boolean setGatheringInfo(Gathering_Bean gathering_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into gathering values "+" (?,?,?,?,?,?)";
		boolean g=insert(sql, gathering_Bean.getC_gathering_type(),gathering_Bean.getC_gathering_name(),gathering_Bean.getC_gathering_card(),gathering_Bean.getC_gathering_bank(),gathering_Bean.getC_gathering_branch(),gathering_Bean.getC_id());
		return g;
	}
	//�޸��տ�����Ϣ
	@Override
	public boolean changeGatheringInfo(Gathering_Bean gathering_Bean) {
		// TODO Auto-generated method stub
		String sql="update gathering set C_gathering_type=? , C_gathering_name=? , C_gathering_card=?,C_gathering_bank=? , C_gathering_branch=?";
		boolean g=	update(sql, gathering_Bean.getC_gathering_type(),gathering_Bean.getC_gathering_name(),gathering_Bean.getC_gathering_card(),gathering_Bean.getC_gathering_bank(),gathering_Bean.getC_gathering_branch());	
		return g;
	}


}
