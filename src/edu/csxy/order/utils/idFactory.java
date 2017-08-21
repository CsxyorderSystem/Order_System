package edu.csxy.order.utils;


public class idFactory {
	
	private static String U_id_key = "U";//�û�id������
	private static String P_id_key = "P";//�����û�id������
	private static String T_id_key = "T";//��λ�û�id������
	private static String B_id_key = "B";//�̼��û�id������
	private static String M_id_key = "M";//��Ӫ�û�id������
	private static String C_id_key = "C";//����ID������
	private static String L_id_key  = "L";//Ӫҵִ��ID������
	private static String PR_id_key = "PR" ;//�������֤ID������
	private static String S_id_key = "S";//ǩԼ����ϢID������
	private static String O_id_key = "O";//����ID������
	private static String R_id_key = "R";//����ID������
	private static String F_id_key = "F"; //ʳ��ID������
	private static String A_id_key = "A"; //��ַID������
	private static String N_id_key = "N" ; //���ID������
	private static String FT_id_key = "FT";//��Ʒ���ID������
	
	
	public static String createUserId(){//�����û�id
		String U_id = U_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return U_id;
		
	}
	public static String createPersonId(){//���ɸ����û�id
		String P_id = P_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return P_id;
		
	}
	public static String createTeamId(){//���ɵ�λ�û�id
		String T_id = T_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return T_id;
		
	}
	
	public static String createBusinessId(){//�����̼��û�id
		String B_id = B_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return B_id;
		
	}
	
	public static String createManagerId(){//������Ӫ�û�id
		String M_id = M_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return M_id;
		
	}
	public static String createCanteenId(){//���ɵ���id
		String C_id = C_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return C_id;
		
	}
	public static String createLincenseId(){//����ִ��id
		String L_id = L_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return L_id;
		
	}
	public static String createPermissionId(){//�������֤id
		String PR_id = PR_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return PR_id;
		
	}
	
	public static String createFoodTypeId(){//���ɲ�Ʒ�����Ϣid
		String FT_id = FT_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return FT_id;
		
	}
	
	public static String createSignId(){//����ǩԼ��id
		String S_id = S_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return S_id;
		
	}
	public static String createOrderId(){//���ɶ���id
		String O_id = O_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return O_id;
		
	}
	public static String createRequestId(){//��������d
		String R_id = R_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return R_id;
		
	}
	public static String createFoodId(){//����ʳ��id
		String F_id = F_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return F_id;
		
	}
	
	public static String createAddressId(){//���ɵ�ַid
		String A_id = A_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return A_id;
		
	}
	
	public static String createNormId(){//������Ӫ�û�id
		String N_id = N_id_key
				+(System.currentTimeMillis()+"").substring(1)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return N_id;
		
	}
	
	
	public static void main(String[] args) {
		for(int i = 0 ;i<20;i++){
			System.out.println(idFactory.createUserId().length());
		}
	}
}
