package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Norm_Bean;

public class Food{
	
	private Food_Bean food_info;
	private List<Norm_Bean> norms ;
	private int count = 0;
	private float Estimate = 0;
	private String F_type_name = "";
	
	public List<Norm_Bean> getNorms() {
		return norms;
	}
	public void setNorms(List<Norm_Bean> norms) {
		this.norms = norms;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public float getRealPrice(){//计算实际价格
		return count;
		}
	
	public float getGatheringPrice(){//计算应付价格
		return count;
		}
	public float getEstimate() {
		return Estimate;
	}
	public void setEstimate(float estimate) {
		Estimate = estimate;
	}
	public Food_Bean getFood_info() {
		return food_info;
	}
	public void setFood_info(Food_Bean food_info) {
		this.food_info = food_info;
	}
	public String getF_type_name() {
		return F_type_name;
	}
	public void setF_type_name(String f_type_name) {
		F_type_name = f_type_name;
	}
	
	
}
