package Apple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class demo_jdbc {
	
	public static void main(String[] args) throws Exception
	{
		//step 1: load drivers and connect jar file
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded successfully");
		
		//step 2: esstablish connection
 Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first", "postgres", "admin");
		
//step 3: create statement
PreparedStatement ps = con.prepareStatement("insert into employee values(4,'vaibhav', 'vaibhav56@gmail.com')");

//step 4: execute the statement
ps.executeUpdate();
System.out.println("Record saved, Done");

//step 5: close the connection
con.close();

	}

	
	
}
