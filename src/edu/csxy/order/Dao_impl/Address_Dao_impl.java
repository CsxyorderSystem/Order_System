package edu.csxy.order.Dao_impl;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.service_domain.Address_Bean;

public class Address_Dao_impl extends BaseDao<Address_Bean> implements address_Dao{

	@Override
	//查询地址，完成
	public Address_Bean getAddress(String A_id ) {
		String sql = "select * from address where A_id = ?";
		return query(sql, A_id);
	}

	@Override
	//加入地址 完成
	public boolean setAddress(Address_Bean address_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into address values "+"(?,?,?,?,?)";
		return insert(sql,address_Bean.getA_id(),address_Bean.getA_province(),address_Bean.getA_city(),address_Bean.getA_district(),address_Bean.getA_street());
	}

	@Override
	// 修改
	public boolean changeAddress(Address_Bean address_Bean) {
		// TODO Auto-generated method stub
		String sql="update address  set A_province=? ,A_city=?,A_district=?,A_street=? where A_id=?";
		return update(sql,address_Bean.getA_province(),address_Bean.getA_city(),address_Bean.getA_district(),address_Bean.getA_street(), address_Bean.getA_id());
	}



}
