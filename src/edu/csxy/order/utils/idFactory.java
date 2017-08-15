package edu.csxy.order.utils;


public class idFactory {
	
	private static String U_id_key = "1";//用户id特征码
	private static String P_id_key = "2";//个人用户id特征码
	private static String T_id_key = "3";//单位用户id特征码
	private static String B_id_key = "4";//商家用户id特征码
	private static String M_id_key = "5";//运营用户id特征码
	
	
	public static String createUserId(){//生成用户id
		String U_id = U_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return U_id;
		
	}
	public static String createPersonId(){//生成个人用户id
		String P_id = P_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return P_id;
		
	}
	public static String createTeamId(){//生成单位用户id
		String T_id = T_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return T_id;
		
	}
	
	public static String createBusinessId(){//生成商家用户id
		String B_id = B_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return B_id;
		
	}
	
	public static String createManagerId(){//生成运营用户id
		String M_id = M_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return M_id;
		
	}
	
	public static void main(String[] args) {
		for(int i = 0 ;i<20;i++){
			System.out.println(idFactory.createUserId());
		}
	}
}
