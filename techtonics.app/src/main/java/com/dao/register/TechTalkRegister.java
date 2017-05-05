package com.dao.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.util.DBConnection;

public class TechTalkRegister {
	
	private static Connection connection = DBConnection.getConnection();
	
	public static boolean registerForTalk(String talkTitle,String username) throws SQLException{
		
		String sql = "insert into techtalkattendees values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, talkTitle);
		preparedStatement.setString(2, username);
		int result = preparedStatement.executeUpdate();
		return result>0;
	}

}
