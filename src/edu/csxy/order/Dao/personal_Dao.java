package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//��ѯ�����û���Ϣ
	public List<Person_Bean> getPersonInfo(String P_id);

	//���¸�����Ϣ
	public Boolean setPersonInfo(Person_Bean person_Bean);
	//��ȡ���˵�¼��Ϣ
	public boolean getPersonalInfo(String U_id);
}
