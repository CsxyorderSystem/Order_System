package edu.csxy.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import edu.csxy.order.app_domain.Business_User;
import edu.csxy.order.app_domain.Person_User;
import edu.csxy.order.app_domain.Team_User;
import edu.csxy.order.service.Business_service;
import edu.csxy.order.service.Person_service;
import edu.csxy.order.service.Team_service;
import edu.csxy.order.service.User_service;
import edu.csxy.order.service_domain.User_Bean;
import edu.csxy.order.utils.Encoder;

/**
 * Servlet implementation class User_servlet
 */
@WebServlet("/User_servlet")
public class User_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private User_service user_service = new User_service();
	private Person_service person_service = new Person_service();
	private Team_service team_service = new Team_service();
	private Business_service business_service = new Business_service();
	public static String errorMassage = "";
	Gson gson = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String method = request.getParameter("method");
		if (method.equals("register")) {
			String json_str = request.getParameter("JSON");
			String type = request.getParameter("type");
			String result = "";
			User_Bean newUser = gson.fromJson(json_str,User_Bean.class );
			if(user_service.Sign(newUser, type)) {
				result = "注册成功";
			}else {
				result = "注册失败";
			}
			response.getWriter().append(result);
		}if(method.equals("login")) {
			String json_str = request.getParameter("JSON");
			String type = request.getParameter("type");
			User_Bean Bean = gson.fromJson(json_str,User_Bean.class );
			Object result = user_service.Login(Bean, type,errorMassage);
			if (result!=null) {
				if(type.equals("个人用户")) {
					Person_User user = (Person_User) result;
					response.getWriter().append(gson.toJson(user));
				}else if (type.equals("单位用户")) {
					Team_User user = (Team_User) result;
					response.getWriter().append(gson.toJson(user));
				}else if (type.equals("商家用户")) {
					Business_User user = (Business_User) result;
					response.getWriter().append(gson.toJson(user));
				}
			}else {
				response.getWriter().append(errorMassage);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
