package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Permission_Bean;



public interface permission_Dao {
	//д�����֤��Ϣ
	public void setPermissionInfo (Permission_Bean permission_Bean);
	
	//��ѯ���֤��Ϣ
	public List<Permission_Bean>  getPermissionInfo(int C_id);

}
