package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Permission_Bean;



public interface permission_Dao {
	//д�����֤��Ϣ
	public boolean setPermissionInfo (Permission_Bean permission_Bean);
	
	//��ѯ���֤��Ϣ
	public Permission_Bean getPermissionInfo(String C_id);

}
