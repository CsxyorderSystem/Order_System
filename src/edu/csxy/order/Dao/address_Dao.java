package edu.csxy.order.Dao;

import edu.csxy.order.service_domain.Address_Bean;

public interface address_Dao {
	
	public Address_Bean getAddress (String A_id);
	public boolean setAddress(Address_Bean address_Bean);

}
