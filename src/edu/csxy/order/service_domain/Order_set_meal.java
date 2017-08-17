package edu.csxy.order.service_domain;

public class Order_set_meal {
	private float S_estimate;
	private int count;
	private String OSM_person;
	private String T_id;
	private String O_id;
	private String S_id;
	public String getT_id() {
		return T_id;
	}
	public String getO_id() {
		return O_id;
	}
	public void setO_id(String o_id) {
		O_id = o_id;
	}
	public String getS_id() {
		return S_id;
	}
	public void setS_id(String s_id) {
		S_id = s_id;
	}
	public void setT_id(String t_id) {
		T_id = t_id;
	}
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
