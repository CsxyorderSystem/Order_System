package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//��ѯ�����û���Ϣ
	public List<Person_Bean> getPersonInfo();

	//���¸�����Ϣ
	public void setPersonInfo(List<String> Person_Bean);
}
