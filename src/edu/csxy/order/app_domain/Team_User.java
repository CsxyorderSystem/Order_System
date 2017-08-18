package edu.csxy.order.app_domain;

import edu.csxy.order.service_domain.Address_Bean;
import edu.csxy.order.service_domain.Team_Bean;
import edu.csxy.order.service_domain.User_Bean;

public class Team_User extends Team_Bean{

	private User_Bean user;
	private Address_Bean address;

	public User_Bean getUser() {
		return user;
	}

	public void setUser(User_Bean user) {
		this.user = user;
	}

	public Address_Bean getAddress() {
		return address;
	}

	public void setAddress(Address_Bean address) {
		this.address = address;
	}
	
	
}
