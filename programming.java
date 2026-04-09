package pune;

public class programming {
	
	public static void main(String args[])
	{
		//if salary is > 30000, and age>35, then eligible for bonus
		
		int sal = 32000;
		int age = 53;
		
		
		if(sal >= 30000)
		{
			
			System.out.println("yes you satisfy both condition");
			System.out.println("your salary is "+(sal+2000));
			
			
		}
		
		else if(age <= 35)
		{
			System.out.println("sorry your age does not match conditions");
		}
		else
		{
			System.out.println("not eligible");
		}
		
	
	}

}
