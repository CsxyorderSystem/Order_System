package edu.csxy.order.Dao_impl;

import java.util.List;

import edu.csxy.order.Dao.food_Dao;
import edu.csxy.order.service_domain.Food_Bean;

public class food_Dao_impl extends BaseDao<Food_Bean> implements food_Dao {
	//��ѯ���в�Ʒ��Ϣ
	@Override
	public Food_Bean getFoodInfo(String F_id) {
		// TODO Auto-generated method stub
		String sql="select * from food where F_id=? ";
		return query(sql, F_id);
	}
	//��ѯ�������в�Ʒ
	@Override
	public List<Food_Bean> getAllFood(String C_id) {
		// TODO Auto-generated method stub
		String sql="select * from food where C_id=? ";
		return queryforList(sql, C_id);
	}
	//�½���Ʒ
	@Override
	public boolean setFood(Food_Bean food_Bean) {
		String sql="insert into food values "+"(?,?,?,?,?,)";
		boolean f =insert(sql, food_Bean.getF_id(),food_Bean.getF_name(),food_Bean.getF_price(),food_Bean.getF_image(),food_Bean.getF_type(),food_Bean.getF_uptime());
		// TODO Auto-generated method stub
		return f;
	}
	//�̼��޸Ĳ�Ʒ��Ϣ
	@Override
	public boolean ChangeFood(Food_Bean food_Bean) {
		// TODO Auto-generated method stub
		String sql="update food where 1=1 set ";
		if(!food_Bean.getF_name().equals("")){
			sql=sql+"  F_name='"+food_Bean.getF_name()+"'";
		}
		if(food_Bean.getF_price()>=-1){
			sql=sql+" , F_price='"+food_Bean.getF_price()+"'";
		}
		if(!food_Bean.getF_image().equals("")){
			sql=sql+" , F_image='"+food_Bean.getF_image()+"'";
		}
		if(!food_Bean.getF_type().equals("")){
			sql=sql+" , F_type='"+food_Bean.getF_type()+"'";
		}
		if(!food_Bean.getF_describe().equals("")){
			sql=sql+" , F_describe='"+food_Bean.getF_describe()+"'";
		}
		if(food_Bean.getF_discount()>-1){
			sql=sql+" , F_discount='"+food_Bean.getF_discount()+"'";
		}
		boolean f=update(sql, food_Bean.getF_name(),food_Bean.getF_price(),food_Bean.getF_image(),food_Bean.getF_type(),food_Bean.getF_describe(),food_Bean.getF_discount());
		return f;
	}
	//�̼�ɾ����Ʒ
	@Override
	public boolean deleteFood(String F_id) {
		// TODO Auto-generated method stub
		String sql="delete from food where F_id=?";
	
		return 	delete(sql, F_id);
	}
	//�û����ۺ�����
	@Override
	public boolean ChangeEstimate(String F_id, Float F_estimate) {
		// TODO Auto-generated method stub
		String sql = "update food set F_estimate=? where 	F_id=?";
		
		return insert(sql,F_estimate,F_id );
	}


	
}
