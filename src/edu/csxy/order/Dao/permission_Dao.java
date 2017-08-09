package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Permission_Bean;



public interface permission_Dao {
	public void setPermissionInfo (List<String> Permission_Bean);
	
	public List<Permission_Bean>  getPermissionInfo(int C_id);

}
