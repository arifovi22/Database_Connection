package databaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import connectdatabase.DatabaseConnection;

public class TestDatabase {
	@Test
	public void validate() {
		
		//For test only
			//checkConnection();
			String expected = "Rajshahi";
			String actual = DatabaseConnection.checkConnection();
			Assert.assertEquals(actual, expected, "not found");	
		}
	
	
	
	@Test
	public void validate2() {
		
		//For test only
			//checkConnection();
			String expected = "Rajshahi";
			String actual = DatabaseConnection.checkConnection();
			Assert.assertEquals(actual, expected, "not found");
			
	}
			
			
			
	
		
		
		
	}


