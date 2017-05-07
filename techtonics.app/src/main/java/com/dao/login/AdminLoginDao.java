package com.dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.util.DBConnection;
import com.model.Employee;

public class AdminLoginDao {

	static Connection connection = DBConnection.getConnection();
	
	public static boolean isAdmin(String email,String password){
		Employee emp;
		try {
			emp = LoginDao.verifyLogin(email, password);
			if(emp.getEmpEmail().equals("admin@atmecs.com"))
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
}
