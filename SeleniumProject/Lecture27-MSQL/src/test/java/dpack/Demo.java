package dpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		// connect to mysql data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Ranjan@1234");
      // for checking the connection with server
	/*	if(!connection.isClosed()) {
        	System.out.println("we have successfuly connected");
        }*/
		//get the data from employees table of demo database (id=3)
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from Employees where id=3;\r\n");
		while(resultset.next()) {
			int id = resultset.getInt("id");
			System.out.println(id);
			String name = resultset.getString("name");
			System.out.println(name);
			String place = resultset.getString("place");
			System.out.println(place);
			int experience = resultset.getInt("experience");
			System.out.println(experience);
			
		}
		
	}

}
