package com.dao.requests;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.util.DBConnection;

public class TechTalkRequest {
	
	private static Connection connection = DBConnection.getConnection();
	
	public static boolean isTalkAlreadyRequested(String talktitle) throws SQLException{
		
		String sql = "select * from techtalkrequests where talktitle=?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, talktitle);
		ResultSet res = preparedStatement.executeQuery();
		if(res.next()){
			return true;
		}
		return false;
	}

	public static boolean requestTalk(String name,String title,String description,Date date) throws SQLException{
		
		if(isTalkAlreadyRequested(title)){
			return false;
		}
		String sql = "insert into techtalkrequests values(?,?,?,?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, title);
		preparedStatement.setString(3, description);
		preparedStatement.setDate(4, date);
		
		int res = preparedStatement.executeUpdate();
		
		return res>0;
		
	}
	
}
