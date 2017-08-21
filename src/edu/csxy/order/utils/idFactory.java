package edu.csxy.order.utils;


public class idFactory {
	
	private static String U_id_key = "U";//用户id特征码
	private static String P_id_key = "P";//个人用户id特征码
	private static String T_id_key = "T";//单位用户id特征码
	private static String B_id_key = "B";//商家用户id特征码
	private static String M_id_key = "M";//运营用户id特征码
	private static String C_id_key = "C";//餐厅ID特征码
	private static String L_id_key  = "L";//营业执照ID特征码
	private static String PR_id_key = "PR" ;//服务许可证ID特征码
	private static String S_id_key = "S";//签约人信息ID特征码
	private static String O_id_key = "O";//订单ID特征码
	private static String R_id_key = "R";//请求ID特征码
	private static String F_id_key = "F"; //食物ID特征码
	private static String A_id_key = "A"; //地址ID特征码
	private static String N_id_key = "N" ; //规格ID特征码
	private static String FT_id_key = "FT";//菜品类别ID特征码
	
	
	public static String createUserId(){//生成用户id
		String U_id = U_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return U_id;
		
	}
	public static String createPersonId(){//生成个人用户id
		String P_id = P_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return P_id;
		
	}
	public static String createTeamId(){//生成单位用户id
		String T_id = T_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return T_id;
		
	}
	
	public static String createBusinessId(){//生成商家用户id
		String B_id = B_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return B_id;
		
	}
	
	public static String createManagerId(){//生成运营用户id
		String M_id = M_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return M_id;
		
	}
	public static String createCanteenId(){//生成店铺id
		String C_id = C_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return C_id;
		
	}
	public static String createLincenseId(){//生成执照id
		String L_id = L_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return L_id;
		
	}
	public static String createPermissionId(){//生成许可证id
		String PR_id = PR_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return PR_id;
		
	}
	
	public static String createFoodTypeId(){//生成菜品类别信息id
		String FT_id = FT_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return FT_id;
		
	}
	
	public static String createSignId(){//生成签约人id
		String S_id = S_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return S_id;
		
	}
	public static String createOrderId(){//生成订单id
		String O_id = O_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return O_id;
		
	}
	public static String createRequestId(){//生成请求d
		String R_id = R_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return R_id;
		
	}
	public static String createFoodId(){//生成食物id
		String F_id = F_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return F_id;
		
	}
	
	public static String createAddressId(){//生成地址id
		String A_id = A_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return A_id;
		
	}
	
	public static String createNormId(){//生成运营用户id
		String N_id = N_id_key
				+(System.currentTimeMillis()+"").substring(1)  //获取系统时间并去前5位
				+(System.nanoTime()+"").substring(7, 10);//取系统时间纳秒数
		
		return N_id;
		
	}
	
	
	public static void main(String[] args) {
		for(int i = 0 ;i<20;i++){
			System.out.println(idFactory.createUserId().length());
		}
	}
}
