package edu.csxy.order.app_domain;

import edu.csxy.order.service_domain.Business_Bean;
import edu.csxy.order.service_domain.User_Bean;

public class Business_User{
	private User_Bean user;
	private Business_Bean business_info;

	public User_Bean getUser() {
		return user;
	}

	public void setUser(User_Bean user) {
		this.user = user;
	}

	public Business_Bean getBusiness_info() {
		return business_info;
	}

	public void setBusiness_info(Business_Bean business_info) {
		this.business_info = business_info;
	}


	
	

}
