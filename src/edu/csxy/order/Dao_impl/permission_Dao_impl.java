package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.service_domain.Permission_Bean;

public class permission_Dao_impl extends BaseDao<Permission_Bean> implements permission_Dao {

	@Override
	public boolean setPermissionInfo(Permission_Bean permission_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into permission values "+" (?,?,?,?,?,?)";
		boolean p=insert(sql, permission_Bean.getC_permission_id(),permission_Bean.getC_permission_name(),permission_Bean.getC_permission_picture(),permission_Bean.getC_permission_date(),permission_Bean.getA_id(),permission_Bean.getC_id());
		return p;
	}

	@Override
	public Permission_Bean getPermissionInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from permission where C_id=?";
		return query(sql, C_id);
	}

	@Override
	public boolean changePermissionInfo(Permission_Bean permission_Bean) {
		// TODO Auto-generated method stub
		String sql="update permission set C_permission_name=?,C_permission_picture=?,C_permission_date=? where C_id=?";
		boolean p= update(sql, permission_Bean.getC_permission_name(),permission_Bean.getC_permission_picture(),permission_Bean.getC_permission_date(),permission_Bean.getC_id());
		return p;
	}


}
