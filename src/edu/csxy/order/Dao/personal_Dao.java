package edu.csxy.order.Dao;

import java.util.List;

import edu.csxy.order.service_domain.Person_Bean;

public interface personal_Dao {
	//��ѯ�����û���Ϣ
	public Person_Bean getPersonInfo(int P_id);

	//���¸�����Ϣ
	public void setPersonInfo(Person_Bean Person_Bean);
}
