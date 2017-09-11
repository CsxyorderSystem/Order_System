package edu.csxy.order.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.csxy.order.app_domain.Business_User;
import edu.csxy.order.app_domain.Person_User;
import edu.csxy.order.app_domain.Team_User;
import edu.csxy.order.service.User_service;
import edu.csxy.order.service_domain.User_Bean;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String usertype;
	private User_service service = new User_service();
	public static String errorMessage = "";
	private Gson gson = new Gson();
	private ActionContext ac = ActionContext.getContext();
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	@Override
	public String execute() throws Exception {
		User_Bean userBean = new User_Bean();
		userBean.setU_phone(username);
		userBean.setU_password(password);
		Object result = service.Login(userBean, usertype, errorMessage);
		String r = "error"; 
		if (result!=null) {
			if(usertype.equals("个人用户")) {
				Person_User user = (Person_User) result;
				ac.getSession().put("user", gson.toJson(user));
				r = "success";
			}else if (usertype.equals("单位用户")) {
				Team_User user = (Team_User) result;
				ac.getSession().put("user", gson.toJson(user));
				r = "success";
			}else if (usertype.equals("商家用户")) {
				Business_User user = (Business_User) result;
				ac.getSession().put("user", gson.toJson(user));
				r = "success";
			}
		}else {
			ac.getSession().put("error",errorMessage);
		}
		super.execute();
		return r;
	}

}
