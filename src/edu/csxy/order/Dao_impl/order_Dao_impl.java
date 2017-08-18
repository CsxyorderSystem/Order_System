package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.order_Dao;
import edu.csxy.order.service_domain.Order_Bean;

public class order_Dao_impl extends BaseDao<Order_Bean> implements order_Dao {
	//新增订单
	@Override
	public boolean AddOrder(Order_Bean order_Bean) {
		// TODO Auto-generated method stub
		String sql="insert into `order`(O_id,O_time,O_price,O_purchase,O_state) "+"(?,?,?,?,?)";
		boolean o=insert(sql, order_Bean.getO_id(),order_Bean.getO_time(),order_Bean.getO_price(),order_Bean.getO_purchase(),order_Bean.getO_state());
		return o;
	}
	//订单状态修改
	@Override
	public boolean changeOrderState(String O_id, String O_state) {
		String sql="update `order` set O_state=? where O_id=?";
		// TODO Auto-generated method stub
		boolean o=update(sql, O_state,O_id);
		return o;
	}
	//修改订单价格
	@Override
	public boolean changeOrderPrice(String O_id,float O_price) {
		// TODO Auto-generated method stub
		String sql="update `order` set O_price=? where O_id=?";
		return update(sql, O_price,O_id);
	}
	//查看订单信息
	@Override
	public Order_Bean getOrderInfo(String O_id) {
		// TODO Auto-generated method stub
		String sql="select * from `order` where O_id=?";
		return query(sql, O_id);
	}
	//查看餐厅所有订单信息 ok
	@Override
	public List<Order_Bean> getCanteenOrderInfo(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from `order` where C_id=?";
		return queryforList(sql, C_id);
	}
	//查看个人de所有订单
	@Override
	public List<Order_Bean> getPersonOrderInfo(String P_id) {
		// TODO Auto-generated method stub
		String sql="select * from `order`, person_order_canteen where `order`.O_id=person_order_canteen.O_id and P_id=? ";
		return queryforList(sql, P_id);
	}
	//查看团队得所有订单
	@Override
	public List<Order_Bean> getTeamOrderInfo(String T_id) {
		// TODO Auto-generated method stub
		String sql="select * from `order`, team_order_canteen where `order`.O_id=team_order_canteen.O_id and T_id=? ";
		return queryforList(sql, T_id);
	}
	
	//查询订餐计划内所包含的订单
	@Override
	public List<Order_Bean> getSetMealOrderInfo(String S_id) {
		// TODO Auto-generated method stub
		String sql="select * from `order`,order_setmeal where `order`.O_id=order_setmeal.O_id and S_id=? ";
		return queryforList(sql, S_id);
	}
	//根据状态查询餐厅所有订单信息
	@Override
	public List<Order_Bean> getCanteenOrderInfo(String C_id, String O_state) {
		// TODO Auto-generated method stub
		String sql="select * from `order` where C_id=?,O_state=?";
		return queryforList(sql, C_id,O_state);
	}
	//根据状态查询所有个人订单信息
	@Override
	public List<Order_Bean> getPersonOrderInfo(String P_id, String O_state) {
		// TODO Auto-generated method stub
		String sql="select * from `order`, person_order_canteen where `order`.O_id=person_order_canteen.O_id and P_id=? and O_state=? ";
		return queryforList(sql, P_id,O_state);
	}
	//根据状态查询所有单位订单信息
	@Override
	public List<Order_Bean> getTeamOrderInfo(String T_id, String O_state) {
		// TODO Auto-generated method stub
		String sql="select * from `order`, team_order_canteen where `order`.O_id=team_order_canteen.O_id and T_id=? and O_state=?";
		return queryforList(sql, T_id,O_state);
	}
	//根据状态查询计划所包含的订单
	@Override
	public List<Order_Bean> getSetMealOrderInfo(String S_id, String O_state) {
		// TODO Auto-generated method stub
		String sql="select * from `order`,order_setmeal where `order`.O_id=order_setmeal.O_id and S_id=? and O_state=?";
		return queryforList(sql, S_id,O_state);
	}
	@Override
	public String getTid(String O_id) {
		// TODO Auto-generated method stub
		String sql="";
		return null;
	}
	@Override
	public String getPid(String O_id) {
		// TODO Auto-generated method stub
		return null;
	}
	//插入TID order team
	@Override
	public boolean insertTid(String O_id, String T_id) {
		// TODO Auto-generated method stub
		String sql="insert into person_order_canteen values "+" (?,?)";
		return insert(sql, O_id,T_id);
	}
	//插入PID到order person
	@Override
	public boolean insertPid(String O_id, String P_id) {
		// TODO Auto-generated method stub
		String sql="insert into team_order_canteen values "+" (?,?)";
		return insert(sql, O_id,P_id);
	}

}
