package edu.csxy.order.app_domain;

import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.User_Bean;

public class Person_User extends Person_Bean{
	private User_Bean user;

	public User_Bean getUser() {
		return user;
	}

	public void setUser(User_Bean user) {
		this.user = user;
	}
	
}
