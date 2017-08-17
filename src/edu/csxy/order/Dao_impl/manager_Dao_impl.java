package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.manager_Dao;
import edu.csxy.order.service_domain.Manager_Bean;

public class manager_Dao_impl extends BaseDao<Manager_Bean> implements manager_Dao {
	//添加运营用户
	@Override
	public boolean addUser(Manager_Bean manager_Bean,String U_id) {
		// TODO Auto-generated method stub
		String sql="insert into manager values "+"(?,?)";
		return insert(sql, manager_Bean.getM_id(),U_id);


}}
