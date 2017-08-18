package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Team_Bean;

public class Order extends Order_Bean{
	private List<Food> foods;
	private String user_id;
//	private int Canteen;
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
//	}
//	public int getCanteen() {
//		return Canteen;
//	}
//	public void setCanteen(int canteen) {
//		Canteen = canteen;
//	}
//	
//	public float sum(){
//		return Canteen;
//		
}
}
