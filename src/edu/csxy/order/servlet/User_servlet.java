package edu.csxy.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

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
			Gson gson = new Gson();
			User_Bean newUser = gson.fromJson(json_str,User_Bean.class );
			if(user_service.Sign(newUser, type)) {
				result = "×¢²á³É¹¦";
			}else {
				result = "×¢²áÊ§°Ü";
			}
			response.getWriter().append("Served at: ").append(result);
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
