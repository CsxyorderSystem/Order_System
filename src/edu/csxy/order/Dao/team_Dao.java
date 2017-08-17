package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//查询企业用户信息
	public List<Team_Bean> getTeamInfo(String T_id);
	
	//写入企业用户信息
	public boolean setTeamInfo(Team_Bean team_Bean,String U_id);
	//登录所用
	public Team_Bean getTeamInfoByUser(String U_id);
	public boolean changeTeamInfo(Team_Bean team_Bean);
}
