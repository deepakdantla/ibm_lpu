package com.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {

	public static Connection connection;
	public static MyConnectionFactory factory;
	
	private MyConnectionFactory() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Deepak@20");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getMyConnection() throws SQLException{
		return connection;
	}
	
	public static MyConnectionFactory getConnectionObject() {
		if (factory == null) {
			factory = new MyConnectionFactory();
		}
		return factory;
	}
}
