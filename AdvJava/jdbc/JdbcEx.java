package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading the driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

//		(2)Creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","weekend1","weekend1");
		
//		(3)Creating the statements
		
		Statement stmt = conn.createStatement();
		
//		(4)Execute the statement
		
		stmt.execute("create table product(pid number,pname varchar2(10),pprice number)");

//		(5)Close the connection
		
		conn.close();
		
		System.out.println("Table is created successfully");
	}

}
