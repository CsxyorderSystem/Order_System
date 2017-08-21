package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
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
import edu.csxy.order.app_domain.Canteen_Request;
import edu.csxy.order.app_domain.Food;
import edu.csxy.order.app_domain.Order;
import edu.csxy.order.app_domain.Set_meal;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Canteen_Request_Bean;
import edu.csxy.order.service_domain.FoodType_Bean;
import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Norm_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;
import edu.csxy.order.utils.idFactory;

public class Canteen_service {
		canteen_Dao canteen_dao=new canteen_Dao_impl();
		business_Dao business_dao=new business_Dao_impl();
		C_Request_Dao c_Request_dao=new C_Request_impl();
		order_Dao order_dao=new order_Dao_impl();
		food_Dao food_dao=new food_Dao_impl();
		lincense_Dao lincense_dao=new lincense_Dao_impl();
		permission_Dao permission_dao=new permission_Dao_impl();
		sign_Dao sign_dao=new sign_Dao_impl();
		gathering_Dao gathering_dao=new gathering_Dao_impl();
		norms_Dao norms_dao=new Norms_Dao_impl();
		set_meal_Dao set_meal_dao = new set_meal_Dao_impl();
		promotion_Dao promotion_dao=new promotion_Dao_impl();
		foodtype_Dao foodtype_dao=new foodtype_Dao_impl();
		public boolean QuailityRequest(Canteen_Request canteen_Request){
			canteen_Request.getCanteen().setC_id(idFactory.createCanteenId());
			canteen_Request.getLincense().setC_lincense_id(idFactory.createLincenseId());
			canteen_Request.getPermission().setC_permission_id(idFactory.createPermissionId());
			canteen_Request.getSign().setC_sign_id(idFactory.createSignId());
			canteen_Request.setCR_id(idFactory.createRequestId());//配置id
			boolean r = c_Request_dao.setRequest(canteen_Request)&&canteen_dao.addCanteen(canteen_Request.getCanteen())
					&&	lincense_dao.setLincenseInfo(canteen_Request.getLincense())
					&&	permission_dao.setPermissionInfo(canteen_Request.getPermission())
					&&gathering_dao.setGatheringInfo(canteen_Request.getGathering())
					&&	sign_dao.setSignInfo(canteen_Request.getSign());
			return r;
			//申请入驻
		}
		public List<Order> QueryOrder(String C_id){
			List<Order_Bean> Beans = order_dao.getCanteenOrderInfo(C_id);
			return createOrderList(Beans);//查询自己接的单
		}
		
		public List<Order> QueryOrder(String C_id,String state){
			List<Order_Bean> Beans = order_dao.getCanteenOrderInfo(C_id, state);
			return createOrderList(Beans);//根据状态查询自己接的单
		}
		
		public boolean ComfirmOrder(int O_id,String O_state){
			return order_dao.;//Dao问题
			//确认订单
		}
		public boolean OpenAndClose(boolean open){
			canteen_dao.//Dao问题
			return false;
			//开店关店
		}
		public List<Food> CheckFood(String C_id){
			List<Food_Bean> Beans = food_dao.getAllFood(C_id);
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
			return gathering_dao.getGatherInfo(C_id);
			//查看收款人信息
		}
		
		public void Mypromotion(){
			//推广的
		}
		public boolean  CreateFoodType(FoodType_Bean foodType_Bean){
			foodType_Bean.setFT_id(idFactory.createFoodTypeId());
			return foodtype_dao.setFoodTypeName(foodType_Bean);
			//创建菜品类别
		}
		public boolean CreateFood(Food food){
			food.setF_id(idFactory.createFoodId());//id工厂问题
			return food_dao.setFood(food);
			//创建菜品
		}
		public boolean DeleteFoodType(String FT_name,int C_id){
			return foodtype_dao.;//Dao问题
			//删除菜品类别
		}
		public boolean DeleteFood(String F_id){
			return food_dao.deleteFood(F_id);
			//删除菜品
		}
		public boolean ChangeNorms(Norm_Bean norm_Bean){
			norm_Bean.setN_id(idFactory.createNormId());//id工厂
			return norms_dao.setNorm(norm_Bean);
			//修改规格
		}
		public boolean ChangeFood(Food food){
			return food_dao.ChangeFood(food);
			//修改菜品
		}
		public boolean  ChangeFoodType(FoodType_Bean food_type_Bean){
			return foodtype_dao.;//Dao问题
			//修改菜品类别
		}
		public boolean CreateSetMeal( Set_meal_Bean set_meal_Bean){
			return false;
			//创建用餐计划
		}
//		public boolean DeleteSetMeal(int S_id,int C_id){
//			return set_meal_dao.d;//Dao问题
//			//删除用餐计划
//		}
		public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
			return false;
			//修改用餐计划
		}
		
		public Set_meal checkSet_meal(int S_id){
			return null;
			//查看用餐计划信息
		}
		
		public List<Set_meal>getAllSet_Meal(int C_id){
			return null;
			//查询用餐计划
		}
		
		public List<Set_meal>getSet_Meal(int C_id,String state){
			return null;
			//根据状态查询用餐计划
		}
		
		public List<Set_meal>getSet_Meal(int C_id,String startTime,String endTime){
			return null;
			//根据时间查询用餐计划
		}
		
		public boolean ComfirmSetMeal(int S_id,String S_state){
			return false;
			//确认用餐计划
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
			return set_meals;
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
			set_meal.setTeam(team_dao);//数据库修改
			return set_meal;
		} 
}
