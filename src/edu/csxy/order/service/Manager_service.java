package edu.csxy.order.service;

import java.util.ArrayList;
import java.util.List;

import edu.csxy.order.Dao.C_Request_Dao;
import edu.csxy.order.Dao.canteen_Dao;
import edu.csxy.order.Dao.gathering_Dao;
import edu.csxy.order.Dao.lincense_Dao;
import edu.csxy.order.Dao.manager_Dao;
import edu.csxy.order.Dao.permission_Dao;
import edu.csxy.order.Dao.sign_Dao;
import edu.csxy.order.Dao_impl.C_Request_impl;
import edu.csxy.order.Dao_impl.canteen_Dao_impl;
import edu.csxy.order.Dao_impl.gathering_Dao_impl;
import edu.csxy.order.Dao_impl.lincense_Dao_impl;
import edu.csxy.order.Dao_impl.manager_Dao_impl;
import edu.csxy.order.Dao_impl.permission_Dao_impl;
import edu.csxy.order.Dao_impl.sign_Dao_impl;
import edu.csxy.order.app_domain.Canteen_Request;
import edu.csxy.order.service_domain.Canteen_Request_Bean;

public class Manager_service {
	String M_id = "";
	C_Request_Dao c_Request_dao =new C_Request_impl();
	lincense_Dao lincense_dao=new lincense_Dao_impl();
	permission_Dao permission_dao=new permission_Dao_impl();
	sign_Dao sign_dao=new sign_Dao_impl();
	gathering_Dao gathering_Dao=new gathering_Dao_impl();
	canteen_Dao canteen_dao=new canteen_Dao_impl();
	
	public Manager_service(String M_id) {
		this.M_id = M_id;
	}
	
	public Canteen_Request getRequest(String CR_id) {
		
		return createC_Request(c_Request_dao.getReuqest(CR_id));
		//查询商家入驻请求
	}
	public List<Canteen_Request> getRequests(String State){
		
		return createRequestList(c_Request_dao)//Dao修改
		//根据状态查询商家入驻请求
	}
	public boolean ChangeRequest(Canteen_Request_Bean bean){
		return c_Request_dao.changeRequestList(bean);
		//更改商家入驻申请
	}
	public void CheckPromotionRequest(int PR_id){
		//查询推广申请
	}
	public void ChangePromotionRequest(int PR_id){
		//更改推广申请状态
	}
	public void ReleasePromotion(){
		//发布推广
	}
	
	public List<Canteen_Request> createRequestList(List<Canteen_Request_Bean> dataScoure) {
		List<Canteen_Request> requests = new ArrayList<Canteen_Request>();
		for(int i = 0;i<dataScoure.size();i++) {
			requests.add(createC_Request(dataScoure.get(i)));
		}
		return requests;
	}
	
	public Canteen_Request createC_Request(Canteen_Request_Bean data){
		Canteen_Request request = new Canteen_Request();
		request.setCanteen(canteen_dao.getCanteenInfo(request.getRequest_info().getC_id()));
		request.setGathering(gathering_Dao.getGatherInfo(request.getRequest_info().getC_id()));
		request.setLincense(lincense_dao.getLincenseInfo(request.getRequest_info().getC_id()));
		request.getRequest_info().setManager(M_id);
		request.setPermission(permission_dao.getPermissionInfo(request.getRequest_info().getC_id()));
		request.setSign(sign_dao.getSignInfo(request.getRequest_info().getC_id()));
		
		return request;
	}
}
