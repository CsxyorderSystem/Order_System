package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.promotion_Dao;
import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao_impl.Address_Dao_impl;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.Norms_Dao_impl;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.food_Dao_impl;
import edu.csxy.order.Dao_impl.foodtype_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.promotion_Dao_impl;
import edu.csxy.order.Dao_impl.set_meal_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.app_domain.Canteen;
import edu.csxy.order.app_domain.Food;
import edu.csxy.order.app_domain.Order;
import edu.csxy.order.app_domain.Set_meal;
import edu.csxy.order.app_domain.ShoppingCar;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;
import edu.csxy.order.service_domain.Team_Bean;


public class Team_service {
	address_Dao address_dao = new Address_Dao_impl();
	team_Dao person=new team_Dao_impl();
	order_Dao order_dao=new order_Dao_impl();
	canteen_Dao canteen_dao=new canteen_Dao_impl();
	food_Dao food_dao=new food_Dao_impl();
	lincense_Dao lincense_dao=new lincense_Dao_impl();
	permission_Dao permission_dao=new permission_Dao_impl();
	sign_Dao sign_dao=new sign_Dao_impl();
	gathering_Dao gathering_Dao=new gathering_Dao_impl();
	norms_Dao norms_dao=new Norms_Dao_impl();
	set_meal_Dao set_meal = new set_meal_Dao_impl();
	foodtype_Dao foodtype_dao=new foodtype_Dao_impl();
	
	public List<Canteen> QueryAllCanteen(){
		List<Canteen_Bean> canteen_beans = canteen_dao.getCanteen();
		return createCanteens(canteen_beans);
		//查询所有餐厅
	}
	public Canteen QueryCanteen(String C_id){
		return null;
		//查询餐厅信息
	}
//	public void QueryAllOrder(){
//		//查询所有订单
//	}
	public List<Order> QueryOrder(String T_id){
		return null;
		//查询个人订单
	}
	
	public List<Order> QueryOrder(String T_id,String State){
		return null;
		//查询个人订单
	}
	
	public Order check_Order(int O_id){
		return null;
		//查看订单信息
	}
	
	public boolean CreateOrder(ShoppingCar shoppingCar){
		return false;
		//创建订单
	} 
	public boolean PayOrder(){
		return false;
		//支付订单
	}
	public boolean ManagerInfo(Team_Bean team_Bean){
		return false;
		//管理单位信息
	}
	public boolean EstimateOrder(String T_id,int O_id,String C_id,String Estlimate){
		return false;
		//评价订单
	}
	public List<Food> CheckFood(String C_id){
		return null;
		//查看菜品
	}
	public Canteen_Bean CheckCanreenInfo(String C_id,String L_id){
		return null;
		//查看餐厅信息
	}
	public Lincense_Bean CheckLinsenceInfo(String C_id,String L_id){
		return null;
		//查看执照信息
	}
	public Sign_Bean CheckSignPersonalInfo(String C_id,String C_sign_id){
		return null;
		//查看注册人信息
	}
	public Gathering_Bean CheckGatheringInfo(String C_id,String C_gathering_card){
		return null;
		//查看收款人信息
	}
	public boolean CreateSetMeal( Set_meal_Bean set_meal_Bean){
		return false;
		//创建用餐计划
	}

	public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
		return false;
		//修改用餐计划
	}
	
	public Set_meal checkSet_meal(int S_id){
		return null;
		//查看用餐计划信息
	}
	
	public List<Set_meal>getAllSet_Meal(String T_id){
		return null;
		//查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String state){
		return null;
		//根据状态查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String startTime,String endTime){
		return null;
		//根据时间查询用餐计划
	}
	
	public List<Canteen> createCanteens(List<Canteen_Bean> datascoure){
		List<Canteen> canteens = new ArrayList<Canteen>();
		for(int i=0;i<datascoure.size();i++) {
			Canteen canteen = new Canteen();
			Canteen_Bean data= datascoure.get(i);
			canteen.setC_id(data.getC_id());
			canteen.setC_name(data.getC_name());
			canteen.setA_id(data.getA_id());
			canteen.setAddress(address_dao.getAddress(canteen.getA_id()));
			canteen.setC_balance(data.getC_balance());
			canteen.setC_contacts(data.getC_contacts());
			canteen.setC_environment(data.getC_environment());
			canteen.setC_estimate(data.getC_estimate());
			canteen.setC_logo(data.getC_logo());
			canteen.setC_open(data.getC_open());
			canteen.setC_phone(data.getC_phone());
			canteen.setC_scope(data.getC_scope());
			canteen.setC_surface(data.getC_surface());
			canteen.setC_type(data.getC_type());
			canteen.setFood_types(foodtype_dao.g);

			canteen.setGathering(gathering_Dao.getGatherInfo(canteen.getC_id()));
			canteen.setLincese(lincense_dao.getLincenseInfo(canteen.getC_id()));
			canteen.setNorms(norms_dao.getAllNorms(canteen.getC_id()));

			canteen.setPermission(permission_dao.getPermissionInfo(canteen.getC_id()));
			canteen.setSet_meals(set_meals);//需要先完成套餐创建的方法
			canteen.setSign(sign_dao.getSignInfo(canteen.getC_id()));
			
			
			List<Food_Bean> food_Beans = food_dao.getAllFood(canteen.getC_id());
			canteen.setFoods(createFoodList(food_Beans));//需要获取食物列表
			
			List<Order_Bean> order_Beans = order_dao.getCanteenOrderInfo(canteen.getC_id());
			canteen.setOrders(createOrderList(order_Beans));//需要先完成创建订单列表的方法
			
			canteens.add(canteen);
		}
		return canteens;
	}
	
	public List<Food> createFoodList(List<Food_Bean> dataScoure ){
		List <Food> Foods = new ArrayList<Food>();
		for(int i= 0; i<dataScoure.size();i++) {
			Food food=new Food();
			Food_Bean data = dataScoure.get(i);
			food.setF_describe(data.getF_describe());
			food.setF_discount(data.getF_discount());
			food.setF_estimate(data.getF_estimate());
			food.setF_id(data.getF_id());
			food.setF_image(data.getF_image());
			food.setF_name(data.getF_name());
			food.setF_number(data.getF_number());
			food.setF_price(data.getF_price());
			food.setF_type(foodtype_dao.getFoodTypeName(data.getF_type()));//数据库需要修改
			food.setF_uptime(data.getF_uptime());
			food.setNorms(norms_dao.));//数据库修改
			Foods.add(food);
		}
		return Foods;
	}
	
	public List<Order> createOrderList(List<Order_Bean> dataScoure){

		List<Order> orders = new ArrayList<Order>();
		for(int i = 0;i<dataScoure.size();i++) {
			Order order = new Order();
			Order_Bean data = dataScoure.get(i);
			order.setC_id(data.getC_id());
			List<Food_Bean> food_Beans = food_dao.get
			order.setFoods(data.);//创建订单内的菜品列表
			order.setO_estimate(data.getO_estimate());
			order.setO_id(data.getO_id());
			order.setO_price(data.getO_price());
			order.setO_purchase(data.getO_purchase());
			order.setO_reason(data.getO_reason());
			order.setO_state(data.getO_state());
			order.setO_time(data.getO_id());
			order.setO_usetime(data.getO_usetime());
			order.setUser_id(order_dao.get);
			orders.add(order);
		}
		return orders;
	}
	
	public List<Set_meal> createSet_meal(){
		
	}
}
