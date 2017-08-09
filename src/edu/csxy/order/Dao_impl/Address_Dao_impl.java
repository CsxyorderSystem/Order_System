package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.Address_Dao;
import edu.csxy.order.service_domain.Address;

public class Address_Dao_impl extends BaseDao<Address> implements Address_Dao{

	@Override
	public Address getAddress(String A_id ) {
		String sql = "select * from address where A_id = ?";
		return query(sql, A_id);
	}

}
