package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//��ѯ��ҵ�û���Ϣ
	public List<Team_Bean> getTeamInfo(int T_id);
	
	//д����ҵ�û���Ϣ
	public Team_Bean setTeamInfo(Team_Bean team_Bean);
	//��¼����
	public Team_Bean getTeamInfoByUser(int U_id);
}
