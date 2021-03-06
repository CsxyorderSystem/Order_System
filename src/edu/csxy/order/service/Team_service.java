package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

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
import edu.csxy.order.Dao.order_set_meal_Dao;
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
import edu.csxy.order.Dao_impl.order_set_meal_Dao_impl;
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
import edu.csxy.order.utils.idFactory;


public class Team_service {
	address_Dao address_dao = new Address_Dao_impl();
	team_Dao team_dao=new team_Dao_impl();
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
	Gson gson = new Gson();
	
	public List<Canteen> QueryAllCanteen(){
		List<Canteen_Bean> canteen_beans = canteen_dao.getCanteen();
		return createCanteens(canteen_beans);
		//查询所有餐厅
	}
	public Canteen QueryCanteen(String C_id){
		Canteen_Bean data = canteen_dao.getCanteenInfo(C_id);
		return createCanteen(data);
		//查询餐厅信息
	}
//	public void QueryAllOrder(){
//		//查询所有订单
//	}
	public List<Order> QueryOrder(String T_id){
		List<Order_Bean> order_Beans = order_dao.getTeamOrderInfo(T_id);
		return createOrderList(order_Beans);
		//查询单位订单
	}
	
	public List<Order> QueryOrder(String T_id,String State){
		 List<Order_Bean> order_Beans = order_dao.getTeamOrderInfo(T_id, State);
		return createOrderList(order_Beans);
		//查询单位订单
	}
	
	public Order check_Order(String O_id){
		Order_Bean data = order_dao.getOrderInfo(O_id);
		return createOrder(data) ;
		//查看订单信息
	}
	
	public boolean CreateOrder(Order newOrder,String T_id){
		boolean falg = true;
		newOrder.getOrder_info().setO_id(idFactory.createOrderId());
		falg = falg&&order_dao.AddOrder(newOrder.getOrder_info());
		for(int i= 0;i<newOrder.getFoods().size();i++) {
			Food data = newOrder.getFoods().get(i);
			falg = falg&&order_dao.addFoodIntoOrder(newOrder.getOrder_info().getO_id(), data.getFood_info().getF_id(), data.getCount(),gson.toJson(data.getNorms()));//将菜品插入订单，添加用户选择的规格
		}
		falg = falg&&order_dao.insertTid(newOrder.getOrder_info().getO_id(), T_id);
		return falg;
		//创建订单
	} 
	public boolean PayOrder(String O_id ){
		return order_dao.processOrder(Order.payed_state, O_id) ;
		//支付订单
	}
	public boolean ManagerInfo(Team_Bean team_Bean){
		team_dao.changeTeamInfo(team_Bean);
		return false;
		//管理单位信息
	}
	public boolean EstimateOrder(Order order){
		
		//评价订单内容
		for (int i = 0;i<order.getFoods().size();i++) {
			
		}//评价菜品内容
		return false;
		//评价订单
	}
	public List<Food> CheckFood(String C_id){
		food_dao.getAllFood(C_id);
		return null;
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
	public boolean CreateSetMeal( Set_meal set_meal,String T_id){
		set_meal_dao.setSet_meal(set_meal.getSet_meal_info());
		for(int i = 0; i<set_meal.getOrders().size();i++) {
			CreateOrder(set_meal.getOrders().get(i),T_id);
		}
		
		return false;
		//创建用餐计划
	}

	public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
		return false;
		//修改用餐计划
	}
	
	public Set_meal checkSet_meal(int S_id){
		return set_meal_dao.getSet_meal(S_id, C_id);//数据库修改
		//查看用餐计划信息
	}
	
	public List<Set_meal>getAllSet_Meal(String T_id){
		return createSet_meal(set_meal_dao.getTeamSet_meal(T_id));
		//查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String state){
		//判断状态
		return createSet_meal(set_meal_dao.getTeamSet_meal(T_id,0));
		//根据状态查询用餐计划
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String startTime,String endTime){
		return createSet_meal(set_meal_dao.);
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
		canteen.setCanteen_info(data);

		canteen.setAddress(address_dao.getAddress(data.getA_id()));
		canteen.setFood_types(foodtype_dao.getfoodtype(data.getC_id()));

		canteen.setGathering(gathering_Dao.getGatherInfo(data.getC_id()));
		canteen.setLincese(lincense_dao.getLincenseInfo(data.getC_id()));
		canteen.setNorms(norms_dao.getAllNorms(data.getC_id()));
		canteen.setPermission(permission_dao.getPermissionInfo(data.getC_id()));
		canteen.setSign(sign_dao.getSignInfo(data.getC_id()));
		
		
		List<Food_Bean> food_Beans = food_dao.getAllFood(data.getC_id());
		canteen.setFoods(createFoodList(food_Beans));//需要获取食物列表
		
		List<Order_Bean> order_Beans = order_dao.getCanteenOrderInfo(data.getC_id());
		canteen.setOrders(createOrderList(order_Beans));//需要先完成创建订单列表的方法
		
		List<Set_meal_Bean> set_meal_Beans =set_meal_dao.getCanteenSet_meal(data.getC_id());
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
		food.setFood_info(data);
		food.setF_type_name(foodtype_dao.getFoodTypeName(data.getF_type()));//数据库需要修改
		food.setNorms(norms_dao.queryList(data.getF_id()));//数据库修改
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
		order.setOrder_info(data);
		List<Food_Bean> food_Beans = food_dao.queryfood(data.getO_id());
		order.setFoods(createFoodList(food_Beans));//创建订单内的菜品列表
		return order;
	}
	public List<Set_meal> createSet_meal(List<Set_meal_Bean> dataSource){
		List<Set_meal> set_meals = new ArrayList<Set_meal>();
		for(int i = 0;i<dataSource.size();i++) {
			Set_meal_Bean data= dataSource.get(i);
			set_meals.add(createSetMeal(data));
			}
		
		return set_meals;
	}
	
	public Set_meal createSetMeal (Set_meal_Bean data) {
		Set_meal set_meal = new Set_meal();
		set_meal.setSet_meal_info(data);
		List<Order_Bean> order_Beans = order_dao.getSetMealOrderInfo(data.getS_id());
		set_meal.setOrders(createOrderList(order_Beans));
		set_meal.setOSM_number(order_set_meal_dao.getOSMnumber(O_id, T_id, OSM_person));//数据库修改//数据库修改
		return set_meal;
	} 
	
	//转换数据库存放的订单状态和前端显示的订单状态
	public int getOrderState(String state){
		
		return 0;
		}
	public String getOrderState(int state){
		
		return "";
		}
}
