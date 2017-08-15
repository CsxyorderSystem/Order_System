package edu.csxy.order.app_domain;

import java.util.List;

public class ShoppingCar {
	private List<Food> foods;
	private List<Set_meal> set_meals;
	private float realPrice;
	private float gatheringPrice;
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
	public float getRealPrice() {
		return realPrice;
	}
	public void setRealPrice(float realPrice) {
		this.realPrice = realPrice;
	}
	public float getGatheringPrice() {
		return gatheringPrice;
	}
	public void setGatheringPrice(float gatheringPrice) {
		this.gatheringPrice = gatheringPrice;
	}
	
	public void addFood(){
		//添加菜品到购物车
	}
	
	public void removeFood(){
		//从购物车中移除菜品
	}
	
	public float getDiscount(){
		return gatheringPrice;
		//获取折扣
	}
}
