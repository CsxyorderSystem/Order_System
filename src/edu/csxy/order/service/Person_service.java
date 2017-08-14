package edu.csxy.order.service;

import java.util.List;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.Dao.foodtype_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao.set_meal_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao_impl.Norms_Dao_impl;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.food_Dao_impl;
import edu.csxy.order.Dao_impl.foodtype_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.Dao_impl.set_meal_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;
import edu.csxy.order.app_domain.Canteen;
import edu.csxy.order.app_domain.Food;
import edu.csxy.order.app_domain.Order;
import edu.csxy.order.service_domain.Canteen_Bean;
import edu.csxy.order.service_domain.Gathering_Bean;
import edu.csxy.order.service_domain.Lincense_Bean;
import edu.csxy.order.service_domain.Order_Bean;
import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.Sign_Bean;

public class Person_service {
	
	personal_Dao person=new personal_Dao_impl();
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
	
	
	public List<Order> QueryOrder(int P_id){
		return null;
		//��ѯ���и��˶���
	}
	public Canteen QueryCanteen(int C_id){
		return null;
		//��ѯ�����ڲ�Ʒ��Ϣ����ȫ����Ϣ
	}
	public List<Order> QueryAllOrder(){
		return null;
		//��ѯ�������ж���
	}
	
	public List<Order> QueryOrder(int P_id,String State){
		return null;
		//��ѯ���˶���
	}
	
	public Order check_Order(int O_id){
		return null;
		//�鿴������Ϣ
	}
	
	public List<Canteen> QueryAllCanteen(){
		return null;
		//��ѯ���в����б�
	}
	public void PayOrder(){
		//֧������
	}
	public Person_Bean ManagelInfo(){
		return null;
		//�޸ĸ�����Ϣ
	}
	public Order_Bean CreateOrder(){
		return null;
		//��������
	}
	public void EstlimateOrder(int P_id,int C_id,String Estlimate){
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
}
