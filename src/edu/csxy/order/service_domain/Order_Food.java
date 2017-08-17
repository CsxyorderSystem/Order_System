package edu.csxy.order.service_domain;

public class Order_Food {
	private float F_estimate;
	private int count;
	private String O_id;
	public String getO_id() {
		return O_id;
	}
	public void setO_id(String o_id) {
		O_id = o_id;
	}
	public String getF_id() {
		return F_id;
	}
	public void setF_id(String f_id) {
		F_id = f_id;
	}
	private String F_id;
	public float getF_estimate() {
		return F_estimate;
	}
	public void setF_estimate(float f_estimate) {
		F_estimate = f_estimate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
