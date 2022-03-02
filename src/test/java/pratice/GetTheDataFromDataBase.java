package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.remote.mobile.AddNetworkConnection;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class GetTheDataFromDataBase {
	@SuppressWarnings("null")
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
		// step 1:register the data base
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step 2:established the connection with data base
		Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//step 3:issue the statement
		Statement statement = connection1.createStatement();
		//step 4:execute query
		ResultSet result = statement.executeQuery("select*from std");
		while(result.next()) {
			System.out.println(result.getString(1)+"/t"+result.getString(2));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		//close the data base
		connection.close();
		
	}
			
		}
}	
			
			
			

	

