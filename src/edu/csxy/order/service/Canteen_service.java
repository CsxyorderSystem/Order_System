package edu.csxy.order.service;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.business_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.norms_Dao;
import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.Norms_Dao_impl;
import edu.csxy.order.Dao_impl.business_Dao_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.food_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.order_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;

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
		//set_meal_Dao set_meal = new setmeal_Dao_impl();
		
}
