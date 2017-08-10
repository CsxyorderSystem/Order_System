package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Permission_Bean;



public interface permission_Dao {
	//写入许可证信息
	public void setPermissionInfo (Permission_Bean permission_Bean);
	
	//查询许可证信息
	public List<Permission_Bean>  getPermissionInfo(int C_id);

}
