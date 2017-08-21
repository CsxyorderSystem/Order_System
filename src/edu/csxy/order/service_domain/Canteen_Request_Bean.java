package edu.csxy.order.service_domain;

import java.util.Date;

public class Canteen_Request_Bean {
	private String  CR_id;
	private int C_check=0;
	private int C_sign_check=0;
	private int C_lincense_check=0;
	private int Permission_check=0;
	private int C_gathering_check=0;
	private String C_time;
	private String C_id;
	private String B_id;
	private int C_sign_id;
	private String 	C_lincense_id;
	private int C_gathering_id;
	private String C_permission_id;
	private String Manager;
	
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getB_id() {
		return B_id;
	}
	public void setB_id(String b_id) {
		B_id = b_id;
	}
	public int getC_sign_id() {
		return C_sign_id;
	}
	public void setC_sign_id(int c_sign_id) {
		C_sign_id = c_sign_id;
	}
	public String getC_lincense_id() {
		return C_lincense_id;
	}
	public void setC_lincense_id(String c_lincense_id) {
		C_lincense_id = c_lincense_id;
	}
	public int getC_gathering_id() {
		return C_gathering_id;
	}
	public void setC_gathering_id(int c_gathering_id) {
		C_gathering_id = c_gathering_id;
	}
	public String getC_permission_id() {
		return C_permission_id;
	}
	public void setC_permission_id(String c_permission_id) {
		C_permission_id = c_permission_id;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getC_time() {
		return C_time;
	}
	public void setC_time(String c_time) {
		C_time = c_time;
	}
	public String getCR_id() {
		return CR_id;
	}
	public void setCR_id(String cR_id) {
		CR_id = cR_id;
	}
	public int getC_check() {
		return C_check;
	}
	public void setC_check(int c_check) {
		C_check = c_check;
	}
	public int getC_sign_check() {
		return C_sign_check;
	}
	public void setC_sign_check(int c_sign_check) {
		C_sign_check = c_sign_check;
	}


	public int getPermission_check() {
		return Permission_check;
	}
	public void setPermission_check(int permission_check) {
		Permission_check = permission_check;
	}
	
	public int getC_lincense_check() {
		return C_lincense_check;
	}
	public void setC_lincense_check(int c_lincense_check) {
		C_lincense_check = c_lincense_check;
	}
	public int getC_gathering_check() {
		return C_gathering_check;
	}
	public void setC_gathering_check(int c_gathering_check) {
		C_gathering_check = c_gathering_check;
	}
	

	
}
