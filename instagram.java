package Apple;

import java.sql.*;
import java.util.*;
 
public class instagram
{
 
	public static void main(String[] args) throws Exception
	{
			
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first","postgres","admin");
		
		int a,n,choice;
		String b,c,d,e,ans;
		Scanner s1 = new Scanner(System.in);
		do
		{
		System.out.println("Enter Your Choice !");
		System.out.println("\n1.Register Here\n2.Login Here\n3.Exit\n4.ForgotPassword");
		choice=s1.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("\n---------INSTAGRAM REGSITRATION FORM-------------------\n");
			System.out.println("Enter ID :\n");
			a=s1.nextInt();
			System.out.println("Enter Username :\n");
			b=s1.next();
			System.out.println("Enter Password :\n");
			c=s1.next();
			System.out.println("Enter Confirm Pass :\n");
			d=s1.next();
			System.out.println("Enter Email :\n ");
			e=s1.next();		
			PreparedStatement ps=con.prepareStatement("insert into instagram values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");
			if(c.equals(d))
			{
			
			int p=ps.executeUpdate();
			
			System.out.println("----------------------Registration Successfull !----------------------------");
			}
			else
			{
				 System.out.println("Password And Confirm is Not Matched!");
			}
			break;
			
		case 2:
			
			    // Login Form
			String x,y;
			System.out.println("\n---------------LOGIN FORM--------------------\n");
			System.out.println("Enter Username : \n");
			x=s1.next();
			System.out.println("Enter Password :\n");
			y=s1.next();
			
			PreparedStatement ps1=con.prepareStatement("select * from instagram where iusername='"+x+"' and ipass='"+y+"'");
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Login Successfull !");
			}
			else
			{
				 System.out.println("Login Fail !");
			}
					
			break;
			
		case 3:
			System.out.println("Exit");
			break;
		case 4:
				// Forgot Password //
			break;
			
		}
		
		
		System.out.println("You Want to Continue the Application The Enter Yes");
		ans=s1.next();
		  
		
		}while(ans.equals("Yes"));
		
		
		System.out.println("\n***************THANK YOU ! VISIT AGAIN***********************\n");
		
		con.close();
	}
 
}
 
 
