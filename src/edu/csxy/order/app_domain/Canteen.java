package edu.csxy.order.app_domain;

import java.util.List;

import edu.csxy.order.service_domain.Address_Bean;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.FoodType_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Norm_Bean;
import edu.csxy.order.service_domain.Permission_Bean;
import edu.csxy.order.service_domain.Sign_Bean;

public class Canteen {
	private Canteen_Bean canteen_info;
	private Address_Bean address;
	private Lincense_Bean lincese;
	private Sign_Bean sign;
	private Gathering_Bean gathering;
	private Permission_Bean permission;
	private List<Norm_Bean> norms;
	private List<Food> foods;
	private List<Set_meal> set_meals;
	private List<FoodType_Bean> food_types;
	private List<Order> orders;
	

	public Address_Bean getAddress() {
		return address;
	}
	public void setAddress(Address_Bean address) {
		this.address = address;
	}
	public Lincense_Bean getLincese() {
		return lincese;
	}
	public void setLincese(Lincense_Bean lincese) {
		this.lincese = lincese;
	}
	public Sign_Bean getSign() {
		return sign;
	}
	public void setSign(Sign_Bean sign) {
		this.sign = sign;
	}
	public Gathering_Bean getGathering() {
		return gathering;
	}
	public void setGathering(Gathering_Bean gathering) {
		this.gathering = gathering;
	}
	public Permission_Bean getPermission() {
		return permission;
	}
	public void setPermission(Permission_Bean permission) {
		this.permission = permission;
	}
	public List<Norm_Bean> getNorms() {
		return norms;
	}
	public void setNorms(List<Norm_Bean> norms) {
		this.norms = norms;
	}
	public List<Food> getFoods() {
		return foods;
	}
	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	public List<Set_meal> getSet_meals() {
		return set_meals;
	}
	public void setSet_meals(List<Set_meal> set_meals) {
		this.set_meals = set_meals;
	}
	public List<FoodType_Bean> getFood_types() {
		return food_types;
	}
	public void setFood_types(List<FoodType_Bean> food_types) {
		this.food_types = food_types;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	
	public Canteen_Bean getCanteen_info() {
		return canteen_info;
	}
	public void setCanteen_info(Canteen_Bean canteen_info) {
		this.canteen_info = canteen_info;
	}
	public float getTumover(){//统计营业额
		return 0;
		
	}
	
	public void open(){//开店、关店
	}
	
}
