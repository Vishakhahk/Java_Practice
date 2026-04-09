package Berries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class wonder {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/march", "postgres", "admin");
		System.out.println("Connection established successfully");
		PreparedStatement ps = con.prepareStatement("insert into employee values(1,'vaibhav', 'vaibhav@123','vaibhav@gmail.com')");
		// 1. Execute the update
		ps.executeUpdate();
		System.out.println("Record saved, Done");

		// 2. Use a separate Statement for the query
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");

		System.out.println("ID\tNAME\tPASSWORD\tEMAIL");

		// 3. You MUST loop through the result set to see the data
		while (rs.next()) {
		    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
		}

		con.close();
	}

}