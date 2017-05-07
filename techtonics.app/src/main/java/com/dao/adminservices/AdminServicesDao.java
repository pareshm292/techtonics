package com.dao.adminservices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.db.util.DBConnection;

public class AdminServicesDao {
	
	private static Connection connection = DBConnection.getConnection();
	
	public static ArrayList<String> techTalkAttendees(String talkTitle) throws SQLException{
		ArrayList<String> talkAttendees = new ArrayList<String>();
		
		String sql = "select * from techtalkattendees where title=?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, talkTitle);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()){
			talkAttendees.add(rs.getString(2));
		}
		System.out.println(talkAttendees);
		return talkAttendees;
	}

}
