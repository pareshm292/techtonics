package com.dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.util.DBConnection;
import com.model.Employee;

public class LoginDao {

	Connection connection;
	
	public Employee verifyLogin(String email,String password) throws SQLException{
		System.out.println(connection);
		String sql = "select * from employees where email=? and password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()){
			System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+ resultSet.getString(3));
			return new Employee(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
		}
		return null;
	}

	public LoginDao() {
		super();
		this.connection = DBConnection.getConnection();
		
	}
	
}
