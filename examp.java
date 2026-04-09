package BlueOcean;

class address
{
        int pin;
        String city;
        String state;
        String country;
        address(int pin, String city, String state, String country)
	       {
	    	   this.pin=pin;
	    	   this.city=city;
	    	   this.state=state;
	    	   this.country=country;
	       }
 }

 class student
{
	
	int roll;
	String name;
	 address a1;
	 
	       student(int roll, String name, address a1)
	       {
	    	   this.roll=roll;
	    	   this.name=name;
	    	   
	    	   this.a1=a1;
	       }
	
	            void show()
	        {
		System.out.println(a1.pin);
		System.out.println(a1.city);
		System.out.println(a1.state);
		System.out.println(a1.country);
		System.out.println(roll + " "+ name);
	}
}
	
	            public class examp
	            {
	            	
	            
    public static void main(String[] args)
    {
 address a10 = new address(22,"pune","maharashtra","India");
 student s1 = new student(101,"vishakha",a10);
 s1.show();
    }
  }
