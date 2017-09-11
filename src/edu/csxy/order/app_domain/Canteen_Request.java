package edu.csxy.order.app_domain;

import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Canteen_Request_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Permission_Bean;
import edu.csxy.order.service_domain.Sign_Bean;

public class Canteen_Request {
	private Canteen_Request_Bean request_info;
	private Lincense_Bean lincense;
	private Sign_Bean sign;
	private Gathering_Bean gathering;
	private Permission_Bean permission;
	private Canteen_Bean canteen;
	public Lincense_Bean getLincense() {
		return lincense;
	}
	public void setLincense(Lincense_Bean lincense) {
		this.lincense = lincense;
	}
	public Sign_Bean getSign() {
		return sign;
	}
	public void setSign(Sign_Bean sign) {
		this.sign = sign;
	}
	public Gathering_Bean getGathering() {
		return gathering;
	}
	public void setGathering(Gathering_Bean gathering) {
		this.gathering = gathering;
	}
	public Permission_Bean getPermission() {
		return permission;
	}
	public void setPermission(Permission_Bean permission) {
		this.permission = permission;
	}
	public Canteen_Bean getCanteen() {
		return canteen;
	}
	public void setCanteen(Canteen_Bean canteen) {
		this.canteen = canteen;
	}
	public Canteen_Request_Bean getRequest_info() {
		return request_info;
	}
	public void setRequest_info(Canteen_Request_Bean request_info) {
		this.request_info = request_info;
	}
	
	
	
	

}
