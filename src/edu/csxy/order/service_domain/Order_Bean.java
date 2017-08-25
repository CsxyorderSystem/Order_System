package edu.csxy.order.service_domain;

public class Order_Bean {
	private String O_id;
	private String O_time;
	private String O_price;
	private String O_purchase;
	private String O_estimate;
	private int O_state;
	private String O_usetime;
	private String O_reason;
	private String C_id;

	public String getC_id() {
		return C_id;
	}
	public void setC_id(String c_id) {
		C_id = c_id;
	}
	public String getO_reason() {
		return O_reason;
	}
	public void setO_reason(String o_reason) {
		O_reason = o_reason;
	}
	public String getO_id() {
		return O_id;
	}
	public void setO_id(String o_id) {
		O_id = o_id;
	}
	public String getO_time() {
		return O_time;
	}
	public void setO_time(String o_time) {
		O_time = o_time;
	}
	public String getO_price() {
		return O_price;
	}
	public void setO_price(String o_price) {
		O_price = o_price;
	}
	public String getO_purchase() {
		return O_purchase;
	}
	public void setO_purchase(String o_purchase) {
		O_purchase = o_purchase;
	}
	public String getO_estimate() {
		return O_estimate;
	}
	public void setO_estimate(String o_estimate) {
		O_estimate = o_estimate;
	}

	public int getO_state() {
		return O_state;
	}
	public void setO_state(int o_state) {
		O_state = o_state;
	}
	public String getO_usetime() {
		return O_usetime;
	}
	public void setO_usetime(String o_usetime) {
		O_usetime = o_usetime;
	}
}
