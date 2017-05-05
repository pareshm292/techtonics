package com.db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";  
	private static String CONNECTION_URL="jdbc:mysql://localhost:3306/techtonics?useSSL=true";  
	private static String USERNAME="root";  
	private static String PASSWORD="root";
	private static Connection connection;  
	 
	  
	public static Connection getConnection(){  
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	    return connection;  
	}  
}
