package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//查询企业用户信息
	public List<Team_Bean> getTeamInfo();
	
	public void setTeamInfo(Team_Bean team_Bean);

}
