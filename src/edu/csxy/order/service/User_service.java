package edu.csxy.order.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.Dao_impl.user_Dao_impl;
import edu.csxy.order.service_domain.Business_Bean;
import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.Team_Bean;
import edu.csxy.order.service_domain.User_Bean;
import edu.csxy.order.utils.Encoder;
import edu.csxy.order.utils.idFactory;

public class User_service {
	final static String type_person = "����";
	final static String type_team = "��λ";
	final static String type_business = "�̼�";
	
	user_Dao User_Dao = new user_Dao_impl();
	personal_Dao Personal_Dao = new personal_Dao_impl();
	team_Dao  Team_Dao =new team_Dao_impl();
	business_Dao business_Dao = new business_Dao_impl();
	public boolean Login(User_Bean userBean, String user_type){
		
		return false;
		//�û���¼
	}

	public boolean Sign(User_Bean userBean,String type){
		boolean falg = false;
		
		
		try {//�û��������
			Encoder.EncoderByMd5(userBean.getU_password());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(userBean.getU_password().equals("")){//��֤�û��Ƿ����
			userBean.setU_id(idFactory.createUserId());
			falg = User_Dao.sign(userBean.getU_phone(),userBean.getU_password(),userBean.getU_id()); //�û�������������û�
		}else{
			userBean.setU_id(User_Dao.alreadysign(userBean.getU_phone()));//�û����ڷ����û���
		}
		if(type.equals(type_person)){//�����������ʹ�����Ӧ�ľ����û�����
			Person_Bean person_Bean = new Person_Bean();
			person_Bean.setP_id(idFactory.createPersonId());
			falg = Personal_Dao.setPersonInfo(person_Bean);
		}
		else if(type.equals(type_team)){
			Team_Bean team_Bean = new Team_Bean();
			team_Bean.setT_id(idFactory.createTeamId());
			falg = Team_Dao.setTeamInfo(team_Bean);
		}
		else {
			Business_Bean business_Bean= new Business_Bean();
			business_Bean.setB_id(idFactory.createBusinessId());
			falg = business_Dao.setBusinessInfo(business_Bean);
		}
		return falg;
		//�û�ע��
	}
	
	public boolean ForgetPassword(String phone,String newPassword){
		return false;
		//��������
	}
	
	public boolean alreadysign(String U_Phone){
		boolean falg = false;
		if(!User_Dao.alreadysign(U_Phone).equals("")) falg = true;
		return falg;
		
	}
}
