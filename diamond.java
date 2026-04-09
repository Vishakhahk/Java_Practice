package pattern;

public class diamond {

	public static void main(String[] args) 
	{
	   for(int r = 1; r <= 3; r++) {
         
        
         for (int s = 2; s >= r; s--) {
             System.out.print(" ");
         }
     
         for (int c = 1; c <= r; c++) {
        	 if(r%2==0)
        	 {
        		 System.out.print("$ ");        	 }
        	 else
        	 {
        		 System.out.print("# ");
        	 }
    
        
     }
         System.out.println();
         
	   }    
	   for(int r = 2; r >= 1; r--) {
	         
	        
	         for (int s = 2; s >= r; s--) {
	             System.out.print(" ");
	         }
	     
	         for (int c = 1; c <= r; c++) {
	        	 if(r%2==0)
	        	 {
	        		 System.out.print("$ ");        	 }
	        	 else
	        		 
	        	
	        	 {
	        		 System.out.print("# ");
	        	 }
	    
	        
	     }
	         System.out.println();
	         
		   }    
 }
	}
