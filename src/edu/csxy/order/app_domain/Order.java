package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Team_Bean;

public class Order {
	
	public static final  int pay_state = -1;
	public static final  int payed_state = 0;
	public static final  int confirn_state = 1;
	public static final  int use_state = 2;
	public static final  int finish_state = 3;
	public static final  int unconfirn_state = -2;
	
	private Order_Bean order_info;
	
	private List<Food> foods;
	
	private String user_id;
	
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
	}
	public Order_Bean getOrder_info() {
		return order_info;
	}
	public void setOrder_info(Order_Bean order_info) {
		this.order_info = order_info;
	}
	
	
	
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
//}
}
