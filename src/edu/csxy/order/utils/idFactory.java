package edu.csxy.order.utils;


public class idFactory {
	
	private static String U_id_key = "1";//�û�id������
	private static String P_id_key = "2";//�����û�id������
	private static String T_id_key = "3";//��λ�û�id������
	private static String B_id_key = "4";//�̼��û�id������
	private static String M_id_key = "5";//��Ӫ�û�id������
	
	
	public static String createUserId(){//�����û�id
		String U_id = U_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return U_id;
		
	}
	public static String createPersonId(){//���ɸ����û�id
		String P_id = P_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return P_id;
		
	}
	public static String createTeamId(){//���ɵ�λ�û�id
		String T_id = T_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return T_id;
		
	}
	
	public static String createBusinessId(){//�����̼��û�id
		String B_id = B_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return B_id;
		
	}
	
	public static String createManagerId(){//������Ӫ�û�id
		String M_id = M_id_key
				+(System.currentTimeMillis()+"").substring(6,12)  //��ȡϵͳʱ�䲢ȥǰ5λ
				+(System.nanoTime()+"").substring(7, 10);//ȡϵͳʱ��������
		
		return M_id;
		
	}
	
	public static void main(String[] args) {
		for(int i = 0 ;i<20;i++){
			System.out.println(idFactory.createUserId());
		}
	}
}
