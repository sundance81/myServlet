package com.academysmart.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
	Connection dbconn = null;
	PreparedStatement st = null;
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "Byelyaeva";
	String userPass = "311281";

	public void dbFill(String name, String sirname, String email) throws SQLException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			dbconn = DriverManager.getConnection(url, userName, userPass);
			st = dbconn
					.prepareStatement("insert into registry values(?, ?, ?)");
			st.setString(1, name);
			st.setString(2, sirname);
			st.setString(3, email);
			st.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (dbconn != null)
					dbconn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
