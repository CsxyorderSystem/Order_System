package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

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
	Gson gson = new Gson();
	
	
	public List<Order> QueryOrder(String P_id){
		List<Order_Bean> Beans = order_dao.getPersonOrderInfo(P_id);
		return createOrderList(Beans);
		//��ѯ���и��˶���
	}
	public Canteen QueryCanteen(String C_id){
		Canteen_Bean Bean = canteen_dao.getCanteenInfo(C_id);
		return createCanteen(Bean);
		//��ѯ�����ڲ�Ʒ��Ϣ����ȫ����Ϣ
	}
//	public List<Order> QueryAllOrder(){
//		List<Order_Bean> Beans = order_dao.get 
//		return null;
//		//��ѯ�������ж���
//	}
	
	public List<Order> QueryOrder(String P_id,String State){
		List<Order_Bean> Beans = order_dao.getPersonOrderInfo(P_id, State);
		return createOrderList(Beans);
		//��ѯ���˶���
	}
	
	public Order check_Order(String O_id){
		Order_Bean Bean =  order_dao.getOrderInfo(O_id);
		return 		createOrder(Bean);
		//�鿴������Ϣ
	}
	
	public List<Canteen> QueryAllCanteen(){
		List<Canteen_Bean> Beans  =  canteen_dao.getCanteen();
		return createCanteens(Beans);
		//��ѯ���в����б�
	}
	public void PayOrder(){
		//֧������
	}
	public boolean ManagelInfo(Person_Bean person_Bean){
		return person_dao.changePersonInfo(person_Bean);
		//�޸ĸ�����Ϣ
	}
	
	public boolean CreateOrder(Order newOrder,String P_id){
		boolean falg = true;
		newOrder.getOrder_info().setO_id(idFactory.createOrderId());
		falg = falg&&order_dao.AddOrder(newOrder.getOrder_info());
		for(int i= 0;i<newOrder.getFoods().size();i++) {
			Food data = newOrder.getFoods().get(i);
			falg = falg&&order_dao.addFoodIntoOrder(newOrder.getOrder_info().getO_id(), data.getFood_info().getF_id(), data.getCount(),gson.toJson(data.getNorms()));//����Ʒ���붩��������û�ѡ��Ĺ��
		}
		falg = falg&&order_dao.insertTid(newOrder.getOrder_info().getO_id(), P_id);
		return falg;
		//��������
	} 
	public boolean PayOrder(String O_id ){
		return order_dao.processOrder(Order.payed_state, O_id) ;
		//֧������
	}
	
	public List<Food> CheckFood(String C_id){
		List<Food_Bean> Beans  = food_dao.getAllFood(C_id);
		return createFoodList(Beans);
		//�鿴��Ʒ
	}
	public Canteen_Bean CheckCanreenInfo(String C_id){
		return 	canteen_dao.getCanteenInfo(C_id);
		//�鿴������Ϣ
	}
	public Lincense_Bean CheckLinsenceInfo(String C_id){
		return lincense_dao.getLincenseInfo(C_id);
		//�鿴ִ����Ϣ
	}
	public Sign_Bean CheckSignPersonalInfo(String C_id,String C_sign_id){
		return sign_dao.getSignInfo(C_id);
		//�鿴ע������Ϣ
	}
	public Gathering_Bean CheckGatheringInfo(String C_id,String C_gathering_card){
		return gathering_Dao.getGatherInfo(C_id);
		//�鿴�տ�����Ϣ
	}
	
	public boolean CreateSetMeal( Set_meal_Bean set_meal_Bean){
		return false;
		//�����òͼƻ�
	}

	public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
		return false;
		//�޸��òͼƻ�
	}
	
	public Set_meal checkSet_meal(int S_id){
		return null;
		//�鿴�òͼƻ���Ϣ
	}
	
	public List<Set_meal>getAllSet_Meal(String P_id){
		return null;
		//��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getSet_Meal(String P_id,String state){
		return null;
		//����״̬��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getSet_Meal(String P_id,String startTime,String endTime){
		return null;
		//����ʱ���ѯ�òͼƻ�
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
		canteen.setFoods(createFoodList(food_Beans));//��Ҫ��ȡʳ���б�
		
		List<Order_Bean> order_Beans = order_dao.getCanteenOrderInfo(data.getC_id());
		canteen.setOrders(createOrderList(order_Beans));//��Ҫ����ɴ��������б�ķ���
		
		List<Set_meal_Bean> set_meal_Beans =set_meal_dao.getCanteenSet_meal(data.getC_id());
		canteen.setSet_meals(createSet_meal(set_meal_Beans));//��Ҫ������ײʹ����ķ���
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
		food.setF_type_name(foodtype_dao.getFoodTypeName(data.getF_type()));//���ݿ���Ҫ�޸�
		food.setNorms(norms_dao.queryList(data.getF_id()));//���ݿ��޸�
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
		order.setFoods(createFoodList(food_Beans));//���������ڵĲ�Ʒ�б�
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
		set_meal.setSet_meal_info(data);
		List<Order_Bean> order_Beans = order_dao.getSetMealOrderInfo(data.getS_id());
		set_meal.setOrders(createOrderList(order_Beans));
		set_meal.setOSM_number(order_set_meal_dao.getOSMnumber(O_id, T_id, OSM_person));//���ݿ��޸�//���ݿ��޸�
		return set_meal;
	} 
}
