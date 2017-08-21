package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.order_set_meal_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao_impl.Address_Dao_impl;
import edu.csxy.order.Dao_impl.Norms_Dao_impl;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.food_Dao_impl;
import edu.csxy.order.Dao_impl.foodtype_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.order_set_meal_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.Dao_impl.set_meal_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.app_domain.Canteen;
import edu.csxy.order.app_domain.Food;
import edu.csxy.order.app_domain.Order;
import edu.csxy.order.app_domain.Set_meal;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;
import edu.csxy.order.utils.idFactory;

public class Person_service {
	
	personal_Dao person_dao=new personal_Dao_impl();
	address_Dao address_dao = new Address_Dao_impl();
	order_Dao order_dao=new order_Dao_impl();
	canteen_Dao canteen_dao=new canteen_Dao_impl();
	food_Dao food_dao=new food_Dao_impl();
	lincense_Dao lincense_dao=new lincense_Dao_impl();
	permission_Dao permission_dao=new permission_Dao_impl();
	sign_Dao sign_dao=new sign_Dao_impl();
	gathering_Dao gathering_Dao=new gathering_Dao_impl();
	norms_Dao norms_dao=new Norms_Dao_impl();
	set_meal_Dao set_meal_dao = new set_meal_Dao_impl();
	foodtype_Dao foodtype_dao=new foodtype_Dao_impl();
	order_set_meal_Dao order_set_meal_dao =new order_set_meal_Dao_impl();
	
	
	public List<Order> QueryOrder(String P_id){
		List<Order_Bean> Beans = order_dao.getPersonOrderInfo(P_id);
		return createOrderList(Beans);
		//查询所有个人订单
	}
	public Canteen QueryCanteen(String C_id){
		Canteen_Bean Bean = canteen_dao.getCanteenInfo(C_id);
		return createCanteen(Bean);
		//查询餐厅内菜品信息或者全部信息
	}
//	public List<Order> QueryAllOrder(){
//		List<Order_Bean> Beans = order_dao.get 
//		return null;
//		//查询个人所有订单
//	}
	
	public List<Order> QueryOrder(String P_id,String State){
		List<Order_Bean> Beans = order_dao.getPersonOrderInfo(P_id, State);
		return createOrderList(Beans);
		//查询个人订单
	}
	
	public Order check_Order(String O_id){
		Order_Bean Bean =  order_dao.getOrderInfo(O_id);
		return 		createOrder(Bean);
		//查看订单信息
	}
	
	public List<Canteen> QueryAllCanteen(){
		List<Canteen_Bean> Beans  =  canteen_dao.getCanteen();
		return createCanteens(Beans);
		//查询所有餐厅列表
	}
	public void PayOrder(){
		//支付订单
	}
	public boolean ManagelInfo(Person_Bean person_Bean){
		return person_dao.changePersonInfo(person_Bean);
		//修改个人信息
	}
	public Order_Bean CreateOrder(Order newOrder,String P_id){
		newOrder.setO_id(idFactory.createOrderId());
		order_dao.AddOrder(newOrder);
		order_dao.insertPid(newOrder.getO_id(), P_id);
		food_dao.//Dao问题
		//数据库选择的规格存放
		return null;
		//创建订单
	}
	public void EstlimateOrder(String P_id,String C_id,String Estlimate){
		//Dao问题
		//评价订单
	}
	
	public List<Food> CheckFood(String C_id){
		List<Food_Bean> Beans  = food_dao.getAllFood(C_id);
		return createFoodList(Beans);
		//查看菜品
	}
	public Canteen_Bean CheckCanreenInfo(String C_id){
		return 	canteen_dao.getCanteenInfo(C_id);
		//查看餐厅信息
	}
	public Lincense_Bean CheckLinsenceInfo(String C_id){
		return lincense_dao.getLincenseInfo(C_id);
		//查看执照信息
	}
	public Sign_Bean CheckSignPersonalInfo(String C_id,String C_sign_id){
		return sign_dao.getSignInfo(C_id);
		//查看注册人信息
	}
	public Gathering_Bean CheckGatheringInfo(String C_id,String C_gathering_card){
		return gathering_Dao.getGatherInfo(C_id);
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
	
	public List<Set_meal>getAllSet_Meal(String P_id){
		return null;
		//查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String P_id,String state){
		return null;
		//根据状态查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String P_id,String startTime,String endTime){
		return null;
		//根据时间查询用餐计划
	}
	
	
	public List<Canteen> createCanteens(List<Canteen_Bean> datascoure){
		List<Canteen> canteens = new ArrayList<Canteen>();
		for(int i=0;i<datascoure.size();i++) {
			Canteen_Bean data= datascoure.get(i);	
			canteens.add(createCanteen(data));
		}
		return canteens;
	}
	
	public Canteen createCanteen(Canteen_Bean data) {
		Canteen canteen = new Canteen();
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
		canteen.setFood_types(foodtype_dao.getfoodtype(canteen.getC_id()));

		canteen.setGathering(gathering_Dao.getGatherInfo(canteen.getC_id()));
		canteen.setLincese(lincense_dao.getLincenseInfo(canteen.getC_id()));
		canteen.setNorms(norms_dao.getAllNorms(canteen.getC_id()));
		canteen.setPermission(permission_dao.getPermissionInfo(canteen.getC_id()));
		canteen.setSign(sign_dao.getSignInfo(canteen.getC_id()));
		
		
		List<Food_Bean> food_Beans = food_dao.getAllFood(canteen.getC_id());
		canteen.setFoods(createFoodList(food_Beans));//需要获取食物列表
		
		List<Order_Bean> order_Beans = order_dao.getCanteenOrderInfo(canteen.getC_id());
		canteen.setOrders(createOrderList(order_Beans));//需要先完成创建订单列表的方法
		
		List<Set_meal_Bean> set_meal_Beans =set_meal_dao.getCanteenSet_meal(canteen.getC_id());
		canteen.setSet_meals(createSet_meal(set_meal_Beans));//需要先完成套餐创建的方法
		return canteen;
	}
	
	public List<Food> createFoodList(List<Food_Bean> dataScoure ){
		List <Food> Foods = new ArrayList<Food>();
		for(int i= 0; i<dataScoure.size();i++) {
			Food_Bean data = dataScoure.get(i);
			Foods.add(createFood(data));
		}
		return Foods;
	}
	
	public Food createFood(Food_Bean data) {
		Food food=new Food();
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
		food.setNorms(norms_dao.queryList(food.getF_id()));//数据库修改
		return food;
	}
	
	public List<Order> createOrderList(List<Order_Bean> dataScoure){
		List<Order> orders = new ArrayList<Order>();
		for(int i = 0;i<dataScoure.size();i++) {
			Order_Bean data = dataScoure.get(i);
			orders.add(createOrder(data));
		}
		return orders;
	}
	
	public Order createOrder (Order_Bean data) {
		Order order = new Order();
		order.setC_id(data.getC_id());
		List<Food_Bean> food_Beans = food_dao.queryfood(data.getO_id());
		order.setFoods(createFoodList(food_Beans));//创建订单内的菜品列表
		order.setO_estimate(data.getO_estimate());
		order.setO_id(data.getO_id());
		order.setO_price(data.getO_price());
		order.setO_purchase(data.getO_purchase());
		order.setO_reason(data.getO_reason());
		order.setO_state(data.getO_state());
		order.setO_time(data.getO_id());
		order.setO_usetime(data.getO_usetime());
		return order;
	}
	
	public List<Set_meal> createSet_meal(List<Set_meal_Bean> dataSource){
		List<Set_meal> set_meals = new ArrayList<Set_meal>();
		for(int i = 0;i<dataSource.size();i++) {
			Set_meal_Bean data= dataSource.get(i);
			set_meals.add(createSetMeal(data));
			}
	}
	
	public Set_meal createSetMeal (Set_meal_Bean data) {
		Set_meal set_meal = new Set_meal();
		set_meal.setC_id(data.getC_id());
		List<Order_Bean> order_Beans = order_dao.getSetMealOrderInfo(data.getS_id());
		set_meal.setOrders(createOrderList(order_Beans));
		set_meal.setOSM_number(order_set_meal_dao.getOSMnumber(O_id, T_id, OSM_person));//数据库修改
		set_meal.setOSM_person(oSM_person);//数据库修改
		set_meal.setS_describe(data.getS_describe());
		set_meal.setS_endtime(data.getS_endtime());
		set_meal.setS_id(data.getS_id());
		set_meal.setS_name(data.getS_name());
		set_meal.setS_numCer(data.getS_numCer());
		set_meal.setS_price(data.getS_price());
		set_meal.setS_starttime(data.getS_starttime());
		set_meal.setS_state(data.getS_state());
		set_meal.setS_type(data.getS_type());
		set_meal.setS_uptime(data.getS_uptime());
		set_meal.setT_id(data.getT_id());
		set_meal.setTeam(team_dao.get);//数据库修改
		return set_meal;
	} 
}
