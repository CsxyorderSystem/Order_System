package edu.csxy.order.service;

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
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;

public class Canteen_service {
		canteen_Dao canteen=new canteen_Dao_impl();
		business_Dao business=new business_Dao_impl();
		C_Request_Dao c_Request=new C_Request_impl();
		order_Dao order=new order_Dao_impl();
		food_Dao food=new food_Dao_impl();
		lincense_Dao lincense=new lincense_Dao_impl();
		permission_Dao permission=new permission_Dao_impl();
		sign_Dao sign=new sign_Dao_impl();
		gathering_Dao gathering=new gathering_Dao_impl();
		norms_Dao norms=new Norms_Dao_impl();
		set_meal_Dao set_meal = new set_meal_Dao_impl();
		promotion_Dao promotion=new promotion_Dao_impl();
		foodtype_Dao foodtype=new foodtype_Dao_impl();
		
		public Boolean QuailityRequest(Canteen_Request_Bean canteen_Request_Bean){
			return null;
			//申请入驻
		}
		public List<Order> QueryOrder(int C_id){
			return null;//查询自己接的单
		}
		
		public List<Order> QueryOrder(int C_id,String state){
			return null;//根据状态查询自己接的单
		}
		
		public Boolean ComfirmOrder(int O_id,String O_state){
			return null;
			//确认订单
		}
		public Boolean OpenAndClose(int C_open){
			return null;
			//开店关店
		}
		public List<Food> CheckFood(int C_id){
			return null;
			//查看菜品
		}
		public Canteen_Bean CheckCanreenInfo(int C_id,int L_id){
			return null;
			//查看餐厅信息
		}
		public Lincense_Bean CheckLinsenceInfo(int C_id,int L_id){
			return null;
			//查看执照信息
		}
		public Sign_Bean CheckSignPersonalInfo(int C_id,int C_sign_id){
			return null;
			//查看注册人信息
		}
		public Gathering_Bean CheckGatheringInfo(int C_id,int C_gathering_card){
			return null;
			//查看收款人信息
		}
		public void Mypromotion(){
			//推广的
		}
		public FoodType_Bean  CreateFoodType(){
			return null;
			//创建菜品类别
		}
		public FoodType_Bean CreateFood(){
			return null;
			//创建菜品
		}
		public Boolean DeleteFoodType(int FT_name,int C_id){
			return null;
			//删除菜品类别
		}
		public Boolean DeleteFood(int F_name,int C_id){
			return null;
			//删除菜品
		}
		public Norm_Bean ChangeNorms(){
			return null;
			//修改规格
		}
		public boolean ChangeFood(Food_Bean food_Bean){
			return false;
			//修改菜品
		}
		public boolean  ChangeFoodType(FoodType_Bean food_type_Bean){
			return false;
			//修改菜品类别
		}
		public boolean CreateSetMeal( Set_meal_Bean set_meal_Bean){
			return false;
			//创建用餐计划
		}
		public boolean DeleteSetMeal(int S_id,int C_id){
			return false;
			//删除用餐计划
		}
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
		
		public List<Set_meal>getAllSet_Meal(int C_id,String state){
			return null;
			//根据状态查询用餐计划
		}
		
		public List<Set_meal>getAllSet_Meal(int C_id,String startTime,String endTime){
			return null;
			//根据时间查询用餐计划
		}
		
		public Boolean ComfirmSetMeal(int O_id,String O_statr){
			return null;
			//确认用餐计划
		}
}
