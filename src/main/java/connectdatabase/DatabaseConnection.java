package connectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import readUtility.ReadProperties;



public class DatabaseConnection {

	public static String checkConnection() {
		Statement stmt = null;
		ResultSet resultSet = null;
		Connection connection = null;
		String getData = null;
		// Driver
		try {Class.forName("com.mysql.jdbc.Driver");
		String username = ReadProperties.readProperties().get("username");
		String password = ReadProperties.readProperties().get("password");
		String url = ReadProperties.readProperties().get("connection");
		connection= DriverManager.getConnection(url + "world", username, password);
		stmt = connection.createStatement();
		resultSet =stmt.executeQuery("use world;");
		if (stmt.execute("show databases;")) {
			resultSet= stmt.getResultSet();	
		}
		resultSet = stmt.executeQuery("Select name from city where name = 'Rajshahi';");
		while (resultSet.next()) {
			//System.out.println(resultSet.getInt(1)+" || "+resultSet.getString(2)+" || "+ resultSet.getString(3));
		 getData	=(resultSet.getString(1));
		 System.out.println(getData);
		 
		 
		 connection.close();
		 stmt.close();
		 
		 
		}} catch (Exception e) {
			// TODO: handle exception
		}
		return getData;
		
	}
	
	
	
	
	

}
