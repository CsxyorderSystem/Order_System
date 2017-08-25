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
	
	public List<Canteen> QueryAllCanteen(){
		List<Canteen_Bean> canteen_beans = canteen_dao.getCanteen();
		return createCanteens(canteen_beans);
		//��ѯ���в���
	}
	public Canteen QueryCanteen(String C_id){
		Canteen_Bean data = canteen_dao.getCanteenInfo(C_id);
		return createCanteen(data);
		//��ѯ������Ϣ
	}
//	public void QueryAllOrder(){
//		//��ѯ���ж���
//	}
	public List<Order> QueryOrder(String T_id){
		List<Order_Bean> order_Beans = order_dao.getTeamOrderInfo(T_id);
		return createOrderList(order_Beans);
		//��ѯ��λ����
	}
	
	public List<Order> QueryOrder(String T_id,String State){
		 List<Order_Bean> order_Beans = order_dao.getTeamOrderInfo(T_id, State);
		return createOrderList(order_Beans);
		//��ѯ��λ����
	}
	
	public Order check_Order(String O_id){
		Order_Bean data = order_dao.getOrderInfo(O_id);
		return createOrder(data) ;
		//�鿴������Ϣ
	}
	
	public boolean CreateOrder(Order newOrder,String T_id){
		boolean falg = true;
		newOrder.setO_id(idFactory.createOrderId());
		falg = falg&&order_dao.AddOrder(newOrder);
		for(int i= 0;i<newOrder.getFoods().size();i++) {
			Food data = newOrder.getFoods().get(i);
			falg = falg&&order_dao.addFoodIntoOrder(newOrder.getO_id(), data.getF_id(), data.getCount());//����Ʒ���붩��������û�ѡ��Ĺ��
		}
		falg = falg&&order_dao.insertTid(newOrder.getO_id(), T_id);
		return falg;
		//��������
	} 
	public boolean PayOrder(){
		return ;
		//֧������
	}
	public boolean ManagerInfo(Team_Bean team_Bean){
		team_dao.changeTeamInfo(team_Bean);
		return false;
		//����λ��Ϣ
	}
	public boolean EstimateOrder(Order order){
		
		//���۶�������
		for (int i = 0;i<order.getFoods().size();i++) {
			
		}//���۲�Ʒ����
		return false;
		//���۶���
	}
	public List<Food> CheckFood(String C_id){
		food_dao.getAllFood(C_id);
		return null;
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
	public boolean CreateSetMeal( Set_meal set_meal,String T_id){
		set_meal_dao.setSet_meal(set_meal);
		for(int i = 0; i<set_meal.getOrders().size();i++) {
			CreateOrder(set_meal.getOrders().get(i),T_id);
		}
		
		return false;
		//�����òͼƻ�
	}

	public boolean ChangeSetMeal(Set_meal_Bean set_meal_Bean){
		return false;
		//�޸��òͼƻ�
	}
	
	public Set_meal checkSet_meal(int S_id){
		return set_meal_dao.getSet_meal(S_id, C_id);//���ݿ��޸�
		//�鿴�òͼƻ���Ϣ
	}
	
	public List<Set_meal>getAllSet_Meal(String T_id){
		return createSet_meal(set_meal_dao.getTeamSet_meal(T_id));
		//��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String state){
		//�ж�״̬
		return createSet_meal(set_meal_dao.getTeamSet_meal(T_id,0));
		//����״̬��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getSet_Meal(String T_id,String startTime,String endTime){
		return createSet_meal(set_meal_dao.);
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
		canteen.setFoods(createFoodList(food_Beans));//��Ҫ��ȡʳ���б�
		
		List<Order_Bean> order_Beans = order_dao.getCanteenOrderInfo(canteen.getC_id());
		canteen.setOrders(createOrderList(order_Beans));//��Ҫ����ɴ��������б�ķ���
		
		List<Set_meal_Bean> set_meal_Beans =set_meal_dao.getCanteenSet_meal(canteen.getC_id());
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
		food.setF_describe(data.getF_describe());
		food.setF_discount(data.getF_discount());
		food.setF_estimate(data.getF_estimate());
		food.setF_id(data.getF_id());
		food.setF_image(data.getF_image());
		food.setF_name(data.getF_name());
		food.setF_number(data.getF_number());
		food.setF_price(data.getF_price());
		food.setF_type(foodtype_dao.getFoodTypeName(data.getF_type()));//���ݿ���Ҫ�޸�
		food.setF_uptime(data.getF_uptime());
		food.setNorms(norms_dao.queryList(food.getF_id()));//���ݿ��޸�
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
		order.setFoods(createFoodList(food_Beans));//���������ڵĲ�Ʒ�б�
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
		set_meal.setOSM_number(order_set_meal_dao.getOSMnumber(O_id, T_id, OSM_person));//���ݿ��޸�
		set_meal.setOSM_person(oSM_person);//���ݿ��޸�
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
		set_meal.setTeam(team_dao.get);//���ݿ��޸�
		return set_meal;
	} 
	
	//ת�����ݿ��ŵĶ���״̬��ǰ����ʾ�Ķ���״̬
	public int getOrderState(String state){
		
		return 0;
		}
	public String getOrderState(int state){
		
		return "";
		}
}
