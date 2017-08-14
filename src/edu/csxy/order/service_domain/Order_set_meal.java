package edu.csxy.order.service_domain;

public class Order_set_meal {
	private float S_estimate;
	private int count;
	private String OSM_person;
	public float getS_estimate() {
		return S_estimate;
	}
	public void setS_estimate(float s_estimate) {
		S_estimate = s_estimate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getOSM_person() {
		return OSM_person;
	}
	public void setOSM_person(String oSM_person) {
		OSM_person = oSM_person;
	}
	public int getOSM_number() {
		return OSM_number;
	}
	public void setOSM_number(int oSM_number) {
		OSM_number = oSM_number;
	}
	private int OSM_number;
}
