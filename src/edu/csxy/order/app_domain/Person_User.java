package edu.csxy.order.app_domain;

import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.User_Bean;

public class Person_User extends Person_Bean{
	
	private User_Bean user;
	private Person_Bean person_info;

	public User_Bean getUser() {
		return user;
	}

	public void setUser(User_Bean user) {
		this.user = user;
	}

	public Person_Bean getPerson_info() {
		return person_info;
	}

	public void setPerson_info(Person_Bean person_info) {
		this.person_info = person_info;
	}
	
	
}
