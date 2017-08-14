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
import edu.csxy.order.Dao.team_Dao;
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
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Set_meal_Bean;
import edu.csxy.order.service_domain.Sign_Bean;
import edu.csxy.order.service_domain.Team_Bean;


public class Team_service {
	team_Dao person=new team_Dao_impl();
	order_Dao order=new order_Dao_impl();
	canteen_Dao canteen=new canteen_Dao_impl();
	food_Dao food=new food_Dao_impl();
	lincense_Dao lincense=new lincense_Dao_impl();
	permission_Dao permission=new permission_Dao_impl();
	sign_Dao sign=new sign_Dao_impl();
	gathering_Dao gathering=new gathering_Dao_impl();
	norms_Dao norms=new Norms_Dao_impl();
	set_meal_Dao set_meal = new set_meal_Dao_impl();
	foodtype_Dao foodtype=new foodtype_Dao_impl();
	
	public List<Canteen> QueryAllCanteen(){
		return null;
		//��ѯ���в���
	}
	public Canteen QueryCanteen(int C_id){
		return null;
		//��ѯ������Ϣ
	}
//	public void QueryAllOrder(){
//		//��ѯ���ж���
//	}
	public List<Order> QueryOrder(int T_id){
		return null;
		//��ѯ���˶���
	}
	
	public List<Order> QueryOrder(int T_id,String State){
		return null;
		//��ѯ���˶���
	}
	
	public Order check_Order(int O_id){
		return null;
		//�鿴������Ϣ
	}
	
	public Boolean CreateOrder(ShoppingCar shoppingCar){
		return null;
		//��������
	} 
	public Boolean PayOrder(){
		return null;
		//֧������
	}
	public Boolean ManagerInfo(Team_Bean team_Bean){
		return null;
		//����λ��Ϣ
	}
	public Boolean EstimateOrder(int T_id,int O_id,int C_id,String Estlimate){
		return null;
		//���۶���
	}
	public List<Food> CheckFood(int C_id){
		return null;
		//�鿴��Ʒ
	}
	public Canteen_Bean CheckCanreenInfo(int C_id,int L_id){
		return null;
		//�鿴������Ϣ
	}
	public Lincense_Bean CheckLinsenceInfo(int C_id,int L_id){
		return null;
		//�鿴ִ����Ϣ
	}
	public Sign_Bean CheckSignPersonalInfo(int C_id,int C_sign_id){
		return null;
		//�鿴ע������Ϣ
	}
	public Gathering_Bean CheckGatheringInfo(int C_id,int C_gathering_card){
		return null;
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
	
	public List<Set_meal>getAllSet_Meal(int T_id){
		return null;
		//��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getAllSet_Meal(int T_id,String state){
		return null;
		//����״̬��ѯ�òͼƻ�
	}
	
	public List<Set_meal>getAllSet_Meal(int T_id,String startTime,String endTime){
		return null;
		//����ʱ���ѯ�òͼƻ�
	}
	
}
