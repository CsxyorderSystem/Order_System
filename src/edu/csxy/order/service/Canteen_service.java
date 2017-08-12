package edu.csxy.order.service;

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
import edu.csxy.order.service_domain.Canteen_Request_Bean;
import edu.csxy.order.service_domain.FoodType_Bean;
import edu.csxy.order.service_domain.Food_Bean;
import edu.csxy.order.service_domain.Norm_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;

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
		public Canteen_Request_Bean QuailityRequest(){
			return null;
			//申请入驻
		}
		public void QueryAllOrder(){
			//查询所有订单
		}
		public void QueryOrder(int C_id){
			//查询自己接的单
		}
		public void ComfirmOrder(int O_id,String O_statr){
			//查询确认的订单
		}
		public void OpenAndClose(int C_open){
			//开店关店
		}
		public void CheckFood(int C_id){
			//查看菜品
		}
		public void CheckCanreenInfo(int C_id,int L_id){
			//查看餐厅信息
		}
		public void CheckManagementInfo(int C_id,int L_id){
			//查看经营信息
		}
		public void CheckLinsenceInfo(int C_id,int L_id){
			//查看执照信息
		}
		public void CheckSignPersonalInfo(int C_id,int C_sign_id){
			//查看注册人信息
		}
		public void CheckPayPersonInfo(int C_id,int C_gathering_card){
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
		public void DeleteFoodType(int FT_name,int C_id){
			//删除菜品类别
		}
		public void DeleteFood(int F_name,int C_id){
			//删除菜品
		}
		public Norm_Bean ChangeNorms(){
			return null;
			//修改规格
		}
		public Food_Bean ChangeFood(){
			return null;
			//修改菜品
		}
		public FoodType_Bean ChangeFoodType(){
			return null;
			//修改菜品类别
		}
		public Set_meal_Bean CreateSetMeal(){
			return null;
			//创建用餐计划
		}
		public void DeleteSetMeal(int S_id,int C_id){
			//删除用餐计划
		}
		public Set_meal_Bean ChangeSetMeal(){
			return null;
			//修改用餐计划
		}
}
