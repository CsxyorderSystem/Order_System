package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Order_set_meal;

public interface order_set_meal_Dao {
		//设置套餐评分
		public boolean setsetmealestimate(String O_id,String S_id,float S_estimate);
		//订单套餐的数目
		public boolean count(String O_id,String S_id,int count);
		//查看该订单信息
		public List<Order_set_meal> setOSMperson(String O_id,String T_id);
		//插入单位用餐人数
		public boolean getOSMnumber(String O_id,String T_id,String OSM_person);
}
