package edu.csxy.order.Dao_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import edu.csxy.order.Dao.Dao;
import edu.csxy.order.db.ConnectionContext;
import edu.csxy.order.db.JDBCUtils;
import edu.csxy.order.utils.ReflectionUtils;



public class BaseDao<T> implements Dao<T>{
	
	Class<T> clazz=null;
	
	QueryRunner runner=new QueryRunner();
	
	
	public BaseDao(){
		clazz=ReflectionUtils.getSuperGenericType(getClass());
	}

	@Override
	public boolean insert(String sql, Object... args) {
		boolean r=false;
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		ResultSet resultSet=null;
		
		try{
			connection= ConnectionContext.getinstance().get();
			prepareStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			if(args!=null){
				for(int i=0;i<args.length;i++){
					prepareStatement.setObject(i+1, args[i]);
				}
			}
			
			prepareStatement.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();
			return r;
		} finally{
			JDBCUtils.release(resultSet, prepareStatement);
		}
		
		return r;
	}

	@Override
	public T query(String sql, Object... args) {
		
		Connection connection=ConnectionContext.getinstance().get();	
		try {
			return runner.query(connection, sql, new BeanHandler<T>(clazz), args);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(String sql, Object... args) {
		boolean r=false;
		Connection connection=ConnectionContext.getinstance().get();
		PreparedStatement preparedStatement=null;
		 try {
			 preparedStatement=connection.prepareStatement(sql);
			 if(args!=null){
				 for(int i=0;i<args.length;i++){
					 preparedStatement.setObject(i+1, args[i]);
				 }
			 }

				r=preparedStatement.execute();
				r=true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public boolean update(String sql,Object...args) {
		boolean r=false;
		Connection connection=ConnectionContext.getinstance().get();
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			if(args!=null){
				for(int i=0;i<args.length;i++){
					preparedStatement.setObject(i+1, args[i]);
				}
			}
			if(preparedStatement.executeUpdate()>0)r=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return r;
	}

	@Override
	public List<T> queryforList(String sql,Object...args) {
		Connection connection=ConnectionContext.getinstance().get();
		// TODO Auto-generated method stub
		try {
			return runner.query(connection, sql, new BeanListHandler<>(clazz),args);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int Countfordate(String sql,Object...args) {
		int sum=0;
		Connection connection=ConnectionContext.getinstance().get();
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		try {
			preparedStatement=connection.prepareStatement(sql);
			if(args!=null){
				for(int i=0;i<args.length;i++){
					preparedStatement.setObject(i+1, args[i]);
				}
			}
			rs=preparedStatement.executeQuery();
			rs.next();
			sum=rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
// TODO Auto-generated method stub
		return sum;
	}

	@Override
	public String get_time(String sql) {
		String time="";
		Connection connection=ConnectionContext.getinstance().get();
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		try {
			preparedStatement=connection.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			rs.next();
			time=rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return time;
	}
	
}
