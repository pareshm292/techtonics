package com.dao.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.util.DBConnection;

public class TechTalkRegister {
	
	private static Connection connection = DBConnection.getConnection();
	
	public static boolean registerForTalk(String talkTitle,String email) throws SQLException{
		
		if(!isAlreadyRegisteredForTalk(talkTitle, email)){
		String sql = "insert into techtalkattendees values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, talkTitle);
		preparedStatement.setString(2, email);
		int result = preparedStatement.executeUpdate();
		return result>0;
		}
		return false;
	}
	
	public static boolean isAlreadyRegisteredForTalk(String talkTitle,String email) throws SQLException{
		
		String sql = "select * from techtalkattendees where title=? and email=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, talkTitle);
		preparedStatement.setString(2, email);
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next())
			return true;
		return false;
		
	}

}
