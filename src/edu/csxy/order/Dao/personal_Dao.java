package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//��ѯ�����û���Ϣ
	public Person_Bean getPersonInfo(String P_id);

	//charu������Ϣ
	public Boolean setPersonInfo(Person_Bean person_Bean,String U_id);
	//��ȡ���˵�¼��Ϣ
	public Person_Bean getPersonalInfo(String U_id);
	//���¸�����Ϣ
	public boolean changePersonInfo(Person_Bean person_Bean);
}
