package edu.csxy.order.service;



import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.personal_Dao;
import edu.csxy.order.Dao.team_Dao;
import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.personal_Dao_impl;
import edu.csxy.order.Dao_impl.team_Dao_impl;
import edu.csxy.order.Dao_impl.user_Dao_impl;
import edu.csxy.order.app_domain.Business_User;
import edu.csxy.order.app_domain.Team_User;
import edu.csxy.order.service_domain.Business_Bean;
import edu.csxy.order.service_domain.Person_Bean;
import edu.csxy.order.service_domain.Team_Bean;
import edu.csxy.order.service_domain.User_Bean;
import edu.csxy.order.servlet.User_servlet;
import edu.csxy.order.utils.Encoder;
import edu.csxy.order.utils.idFactory;

public class User_service {
	final static String type_person = "�����û�";
	final static String type_team = "��λ�û�";
	final static String type_business = "�̼��û�";
	
	user_Dao User_Dao = new user_Dao_impl();
	personal_Dao Personal_Dao = new personal_Dao_impl();
	team_Dao  Team_Dao =new team_Dao_impl();
	business_Dao business_Dao = new business_Dao_impl();
	public Object Login(User_Bean userBean, String user_type,String errorMessage){
		userBean.setU_password(Encoder.EncoderByMd5(userBean.getU_password()));
		Object result = null;
		String U_id = User_Dao.checkUser(userBean.getU_phone(), userBean.getU_password());//�ж��û������Ƿ���ȷ
		if (U_id.equals("")) {
			User_servlet.errorMassage = "�û�����������";
		}else {//�����û���¼����ƥ��
			userBean.setU_id(U_id);
			if (user_type.equals(type_person)) {
				//Person_Bean person_Bean = Personal_Dao.getPersonalInfo(U_id);
			}
			else if(user_type.equals(type_team)) {
				Team_Bean team_Bean = Team_Dao.getTeamInfoByUser(U_id);
				if(team_Bean!=null) {
					Team_User user = new Team_User();
					user.setT_id(team_Bean.getT_id());
					user.setT_name(team_Bean.getT_name());
					user.setT_phone(team_Bean.getT_phone());
					user.setT_contacts(team_Bean.getT_contacts());
					user.set
					user.setUser(userBean);
					result = user;
				}else {
					User_servlet.errorMassage="�û���������������ѡ��";
				}
			}
			else if(user_type.equals(type_business)) {
				Business_Bean business_Bean = business_Dao.getBusiness(U_id);
				if(business_Dao!=null) {
					Business_User user = new Business_User();
					user.setB_id(business_Bean.getB_id());
					user.setB_name(business_Bean.getB_name());
					user.setB_phone(business_Bean.getB_phone());
					user.setUser(userBean);
					result = user ;
				}else {
					User_servlet.errorMassage="�û���������������ѡ��";
				}
			}
		}
		return result;
		//�û���¼
	}

	public boolean Sign(User_Bean userBean,String type){
		boolean falg = false;
		
		
		userBean.setU_password(Encoder.EncoderByMd5(userBean.getU_password()));
		
		
		if(!userBean.getU_password().equals(" ")){//��֤�û��Ƿ����
			userBean.setU_id(idFactory.createUserId());
			falg = User_Dao.sign(userBean.getU_phone(),userBean.getU_password(),userBean.getU_id()); //�û�������������û�
		}else{
			userBean.setU_id(User_Dao.alreadysign(userBean.getU_phone()));//�û����ڷ����û���
		}
		if(type.equals(type_person)&&falg){//�����������ʹ�����Ӧ�ľ����û�����
			Person_Bean person_Bean = new Person_Bean();
			person_Bean.setP_id(idFactory.createPersonId());
			falg = Personal_Dao.setPersonInfo(person_Bean,userBean.getU_id());
		}
		else if(type.equals(type_team)&&falg){
			Team_Bean team_Bean = new Team_Bean();
			team_Bean.setT_id(idFactory.createTeamId());
			falg = Team_Dao.setTeamInfo(team_Bean,userBean.getU_id());
		}
		else if(type.equals("�̼��û�")&&falg){
			Business_Bean business_Bean= new Business_Bean();
			business_Bean.setB_id(idFactory.createBusinessId());
			falg = business_Dao.setBusinessInfo(business_Bean, userBean.getU_id());
		}
		return falg;
		//�û�ע��
	}
	
	public boolean ForgetPassword(String phone,String newPassword){
		return User_Dao.forgetPassword(newPassword, phone);
		//��������
	}
	
	public boolean alreadysign(String U_Phone){
		boolean falg = false;
		if(!User_Dao.alreadysign(U_Phone).equals("")) falg = true;
		return falg;
		//ȷ���û��Ƿ��Ѿ���ע��
	}
	
	public boolean changePassword(User_Bean userBean) {
		return User_Dao.changePassword(userBean.getU_phone(), userBean.getU_password(), userBean.getU_id());
	}
}
