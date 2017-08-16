package edu.csxy.order.service_domain;

public class Address_Bean {
	private String A_id ;
	private String A_street= "";
	private String A_province = "";
	private String A_city = "";
	private String A_district = "";
	
	
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	public String getA_province() {
		return A_province;
	}
	public void setA_province(String a_province) {
		A_province = a_province;
	}
	public String getA_city() {
		return A_city;
	}
	public void setA_city(String a_city) {
		A_city = a_city;
	}
	public String getA_district() {
		return A_district;
	}
	public void setA_district(String a_district) {
		A_district = a_district;
	}
	public String getA_street() {
		return A_street;
	}
	public void setA_street(String a_street) {
		A_street = a_street;
	}
	
	public String getallpath(){
		String path = "";
		path = A_province + "-" + A_city + "-" + A_district + "-" + A_street;
		return path;
	}
}
