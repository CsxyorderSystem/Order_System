package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//查询企业用户信息
	public List<Team_Bean> getTeamInfo(int T_id);
	
	//写入企业用户信息
	public Team_Bean setTeamInfo(Team_Bean team_Bean);
	//登录所用
	public Team_Bean getTeamInfoByUser(int U_id);
}
