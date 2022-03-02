package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertTheDataIntoDataBase {
	public static void main(String[] args) throws SQLException {
		// step 1:register the data base
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//step 2:established the connection with data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		//step 3:issue the statement
		Statement statement = connection.createStatement();
		//step 4:execute query
		int result = statement.executeUpdate("insert into studentinfo(fname,lname,address)values('koyal','krishna')");
		//step 5:verification
		if(result==1) {
			System.out.println("one set of data is added to database");
		}else {
			System.out.println("data is not added to database");
		}
			//close the database connection
			connection.close();
		
	}
}

		
		
	
	


