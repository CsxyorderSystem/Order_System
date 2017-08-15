package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Permission_Bean;



public interface permission_Dao {
	//写入许可证信息
	public boolean setPermissionInfo (Permission_Bean permission_Bean);
	
	//查询许可证信息
	public Permission_Bean getPermissionInfo(String C_id);

}
