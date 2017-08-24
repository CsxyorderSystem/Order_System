package edu.csxy.order.service_domain;

public class Norm_Bean {
	private String N_id;
	private String N_name;
	private String N_type;
	private float N_price;
	private String C_id;
	private boolean selected = false;
	
	public boolean isSelected() {
		return selected;
	}
	public void Selected() {
		this.selected = !this.selected;
	}
	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	private boolean N_state = false;
	public String getN_id() {
		return N_id;
	}
	public void setN_id(String n_id) {
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

	public float getN_price() {
		return N_price;
	}
	public void setN_price(float n_price) {
		N_price = n_price;
	}
	public boolean isN_state() {
		return N_state;
	}
	public void setN_state(boolean n_state) {
		N_state = n_state;
	}
	public void check(){
		this.N_state=!this.N_state;
	}
}
