package edu.csxy.order.service_domain;

public class Norm_Bean {
	private int N_id;
	private String N_name;
	private String N_type;
	private String N_price;
	private boolean N_state = false;
	public int getN_id() {
		return N_id;
	}
	public void setN_id(int n_id) {
		N_id = n_id;
	}
	public String getN_name() {
		return N_name;
	}
	public void setN_name(String n_name) {
		N_name = n_name;
	}
	public String getN_type() {
		return N_type;
	}
	public void setN_type(String n_type) {
		N_type = n_type;
	}
	public String getN_price() {
		return N_price;
	}
	public void setN_price(String n_price) {
		N_price = n_price;
	}

	public void check(){
		this.N_state=!this.N_state;
	}
}
