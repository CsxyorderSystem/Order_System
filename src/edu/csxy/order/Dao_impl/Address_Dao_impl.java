package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.service_domain.Address_Bean;

public class Address_Dao_impl extends BaseDao<Address_Bean> implements address_Dao{

	@Override
	public Address_Bean getAddress(String A_id ) {
		String sql = "select * from address where A_id = ?";
		return query(sql, A_id);
	}

}
