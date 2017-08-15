package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Norm_Bean;

public class Food extends Food_Bean{
	private List<Norm_Bean> norms ;
	private int count;
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
	
}
