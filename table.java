package one;

 class Tabling
{
	void show()
	{
		int number[] = {10, 20, 30, 40}; // Our Array

		for (int i = 0; i < number.length; i++) {
		  
		    System.out.println(number[i]);
		}
	}
	
	void display() {
	    int demo[] = {92, 84, 24, 89, 99, 56, 78};
	    int target = 84;

	    for (int i = 0; i < demo.length; i++) {
	        if (demo[i] == target) {
	            System.out.println("Element found at index " + i);
	            return;  
	        }
	    }

	    System.out.println("Element not present in array");
	}
		
}
 public class table
 {
     public static void main(String[] args)
     {
         Tabling tt = new Tabling(); 
         tt.show();
         tt.display();
     }
 }
