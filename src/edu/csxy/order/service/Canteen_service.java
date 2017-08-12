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
			//������פ
		}
		public void QueryAllOrder(){
			//��ѯ���ж���
		}
		public void QueryOrder(int C_id){
			//��ѯ�Լ��ӵĵ�
		}
		public void ComfirmOrder(int O_id,String O_statr){
			//��ѯȷ�ϵĶ���
		}
		public void OpenAndClose(int C_open){
			//����ص�
		}
		public void CheckFood(int C_id){
			//�鿴��Ʒ
		}
		public void CheckCanreenInfo(int C_id,int L_id){
			//�鿴������Ϣ
		}
		public void CheckManagementInfo(int C_id,int L_id){
			//�鿴��Ӫ��Ϣ
		}
		public void CheckLinsenceInfo(int C_id,int L_id){
			//�鿴ִ����Ϣ
		}
		public void CheckSignPersonalInfo(int C_id,int C_sign_id){
			//�鿴ע������Ϣ
		}
		public void CheckPayPersonInfo(int C_id,int C_gathering_card){
			//�鿴�տ�����Ϣ
		}
		public void Mypromotion(){
			//�ƹ��
		}
		public FoodType_Bean  CreateFoodType(){
			return null;
			//������Ʒ���
		}
		public FoodType_Bean CreateFood(){
			return null;
			//������Ʒ
		}
		public void DeleteFoodType(int FT_name,int C_id){
			//ɾ����Ʒ���
		}
		public void DeleteFood(int F_name,int C_id){
			//ɾ����Ʒ
		}
		public Norm_Bean ChangeNorms(){
			return null;
			//�޸Ĺ��
		}
		public Food_Bean ChangeFood(){
			return null;
			//�޸Ĳ�Ʒ
		}
		public FoodType_Bean ChangeFoodType(){
			return null;
			//�޸Ĳ�Ʒ���
		}
		public Set_meal_Bean CreateSetMeal(){
			return null;
			//�����òͼƻ�
		}
		public void DeleteSetMeal(int S_id,int C_id){
			//ɾ���òͼƻ�
		}
		public Set_meal_Bean ChangeSetMeal(){
			return null;
			//�޸��òͼƻ�
		}
}
