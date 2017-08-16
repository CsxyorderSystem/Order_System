package edu.csxy.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.csxy.order.Dao.address_Dao;
import edu.csxy.order.Dao.user_Dao;
import edu.csxy.order.Dao.Dao;
import edu.csxy.order.Dao_impl.Address_Dao_impl;
import edu.csxy.order.Dao_impl.BaseDao;
import edu.csxy.order.Dao_impl.user_Dao_impl;
import edu.csxy.order.service_domain.Address_Bean;
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
		String A_province=request.getParameter("A_province");
		String A_id=request.getParameter("A_id");
		String A_city=request.getParameter("A_city");
		String A_district=request.getParameter("A_district");
		String A_street=request.getParameter("A_street");
		address_Dao a = new Address_Dao_impl();
		Address_Bean address_Bean=new Address_Bean();
		address_Bean.setA_id(A_id);
		address_Bean.setA_city(A_city);
		address_Bean.setA_district(A_district);
		address_Bean.setA_province(A_province);
		address_Bean.setA_street(A_street);
		a.changeAddress(address_Bean);
		response.getWriter().append(address_Bean.getallpath());
		//String result=user.checkUser(U_phone, U_password);
		//response.getWriter().append(result);
//		address_Dao address_Dao = new Address_Dao_impl();

//		result.setA_province("asdas");
//		if(true){
//			address_Dao.setAddress(result);
//		}
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
