package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Team_Bean;

public class Set_meal extends Set_meal_Bean{
	private List<Order> orders;
	private Team_Bean team;
	private String[] OSM_person;
	private int OSM_number;
	
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Team_Bean getTeam() {
		return team;
	}
	public void setTeam(Team_Bean team) {
		this.team = team;
	}
	public String[] getOSM_person() {
		return OSM_person;
	}
	public void setOSM_person(String[] oSM_person) {
		OSM_person = oSM_person;
	}
	public int getOSM_number() {
		return OSM_number;
	}
	public void setOSM_number(int oSM_number) {
		OSM_number = oSM_number;
	}
	
	
}
