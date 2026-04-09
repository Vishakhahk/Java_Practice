package string;

public class programInterface {
    public static void main(String[] args) {
    
    	        for (int r = 1; r <= 3; r++) {
    	            
    	            
    	            for (int s = 0; s >= r; s--) {
    	                System.out.print(" ");
    	            }
    	        
    	            for (int c = 1; c <= r; c++) {
    	            	if(c%2==1)
    	            	{
    	                System.out.print("1");
    	            }
    	            	else
    	            	{
    	            		System.out.print("0");
    	            	}
    	       
    	           
    	        }
    	            System.out.println();
    	            
    	    }
    	}

        
    }

