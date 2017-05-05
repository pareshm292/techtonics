package com.dao.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.util.DBConnection;

public class RegistrationDao {

	
	private static Connection connection = DBConnection.getConnection();
	
	public static boolean registerEmployee(String name,String email,String password) throws SQLException{
		
		String sql = "insert into employees values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, password);
		int result = preparedStatement.executeUpdate();
		return result>0;
	}
	
	
}
