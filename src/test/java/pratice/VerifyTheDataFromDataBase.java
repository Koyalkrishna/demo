package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class VerifyTheDataFromDataBase {
	

	public static void main(String[] args) throws Throwable {
		// step 1:register the data base
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step 2:established the connection with data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//step 3:issue the statement
		Statement statement = connection.createStatement();
		//step 4:execute query
		ResultSet result = statement.executeQuery("select * from Stdent");
		while(result.next()) {
			if(result.getString(1).equals(connection));
			{
				System.out.println("passed");
			}
		}
			
			//close the database connection
		connection.close();
	}
}
