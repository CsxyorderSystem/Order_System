package edu.csxy.order.Dao;

public interface order_set_meal_Dao {
	//设置套餐评分
		public boolean setsetmealestimate(int O_id,int S_id);
		//订单套餐的数目
		public boolean count(int O_id,int S_id);
		//选取用餐人员
		public Boolean setOSMperson(int O_id,int T_id);
		//获取单位用餐人数
		public String getOSMnumber(int O_id,int T_id);
}
