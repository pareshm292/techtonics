package com.dao.techtalklist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.db.util.DBConnection;
import com.model.TechTalk;

public class TechTalkDao {
	
	private static Connection connection = DBConnection.getConnection();
	
	
	public static ArrayList<TechTalk> getAllUpcomingTalks() throws SQLException{
	
		ArrayList<TechTalk> listOfTechTalks = new ArrayList<TechTalk>();
		String sql = "select * from techtalks";
		ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
		while(resultSet.next())
		{
			listOfTechTalks.add(new TechTalk(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDate(4)));
		}
		return listOfTechTalks;
	}

}
