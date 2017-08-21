package edu.csxy.order.service_domain;

public class Canteen_Bean {
	private String C_id;
	private String C_name;
	private String C_type;
	private String C_scope;
	private String C_contacts;
	private String C_phone;
	private String C_logo;
	private String C_surface;
	private String C_environment;
	private String A_id;
	private float C_estimate;
	private String C_open = "²»¿ªµê";
	private Float C_balance;
	
	
	public String getA_id() {
		return A_id;
	}
	public void setA_id(String a_id) {
		A_id = a_id;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public String getC_type() {
		return C_type;
	}
	public void setC_type(String c_type) {
		C_type = c_type;
	}
	public String getC_scope() {
		return C_scope;
	}
	public void setC_scope(String c_scope) {
		C_scope = c_scope;
	}
	public String getC_contacts() {
		return C_contacts;
	}
	public void setC_contacts(String c_contacts) {
		C_contacts = c_contacts;
	}
	public String getC_phone() {
		return C_phone;
	}
	public void setC_phone(String c_phone) {
		C_phone = c_phone;
	}
	public String getC_logo() {
		return C_logo;
	}
	public void setC_logo(String c_logo) {
		C_logo = c_logo;
	}
	public String getC_surface() {
		return C_surface;
	}
	public void setC_surface(String c_surface) {
		C_surface = c_surface;
	}
	public String getC_environment() {
		return C_environment;
	}
	public void setC_environment(String c_environment) {
		C_environment = c_environment;
	}
	public float getC_estimate() {
		return C_estimate;
	}
	public void setC_estimate(float c_estimate) {
		C_estimate = c_estimate;
	}
	public String getC_open() {
		return C_open;
	}
	public void setC_open(String c_open) {
		C_open = c_open;
	}
	public Float getC_balance() {
		return C_balance;
	}
	public void setC_balance(Float c_balance) {
		C_balance = c_balance;
	}

}
