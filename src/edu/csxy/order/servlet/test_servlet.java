package edu.csxy.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.Dao.Dao;
import edu.csxy.order.Dao_impl.Address_Dao_impl;
import edu.csxy.order.Dao_impl.BaseDao;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.user_Dao_impl;
import edu.csxy.order.app_domain.Business_User;
import edu.csxy.order.service_domain.Address_Bean;
import edu.csxy.order.service_domain.Business_Bean;
import edu.csxy.order.service_domain.User_Bean;

/**
 * Servlet implementation class Team_servlet
 */
@WebServlet("/test_servlet")
public class test_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String B_id=request.getParameter("B_id");
		business_Dao b=new business_Dao_impl();
		b.getBusinessInfo(B_id);
		response.getWriter().append(B_id);
//		address_Dao address_Dao = new Address_Dao_impl();
//			address_Dao.setAddress(result);
//		response.getWriter().append("s");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
