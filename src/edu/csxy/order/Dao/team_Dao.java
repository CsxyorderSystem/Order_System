package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Team_Bean;

public interface team_Dao {
	//��ѯ��ҵ�û���Ϣ
	public List<Team_Bean> getTeamInfo(String T_id);
	
	//д����ҵ�û���Ϣ
	public boolean setTeamInfo(Team_Bean team_Bean,String U_id);
	//��¼����
	public Team_Bean getTeamInfoByUser(String U_id);
	public boolean changeTeamInfo(Team_Bean team_Bean);
}
