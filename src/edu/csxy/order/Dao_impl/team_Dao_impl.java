package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.service_domain.Team_Bean;

public class team_Dao_impl extends BaseDao<Team_Bean> implements team_Dao {
	//查询企业用户信息完成
	@Override
	public List<Team_Bean> getTeamInfo(String T_id) {
		// TODO Auto-generated method stub
		String sql="select * from team where T_id=?";
		return queryforList(sql, T_id);
	}
	//写入企业用户信息完成 
	@Override
	public boolean setTeamInfo(Team_Bean team_Bean,String U_id) {
		// TODO Auto-generated method stub
		String sql="insert into team values "+" (?,?,?,?,?,?) ";
		boolean t=insert(sql, team_Bean.getT_id(),team_Bean.getT_name(),team_Bean.getT_phone(),team_Bean.getT_contacts(),team_Bean.getA_id(),U_id);
		return t;
	}
	//登录所用 完成
	@Override
	public Team_Bean getTeamInfoByUser(String U_id) {
		// TODO Auto-generated method stub
		String sql="select * from team where U_i=?";
		return query(sql, U_id);
	}
	//修改信息
	@Override
	public boolean changeTeamInfo(Team_Bean team_Bean) {
		// TODO Auto-generated method stub
		String sql="update team set T_name=?, T_phone=?,T_contacts=?, A_id=?  where T_id=?";
		boolean b=update(sql,team_Bean.getT_name(),team_Bean.getT_phone(),team_Bean.getT_contacts(),team_Bean.getA_id(),team_Bean.getT_id() );
		return b;
	}


}
