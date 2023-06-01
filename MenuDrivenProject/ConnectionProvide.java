package com.students.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvide {
	 static Connection  con;
	public static Connection createConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "system";
//			String password = "nitish";
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nitish");	
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

}
