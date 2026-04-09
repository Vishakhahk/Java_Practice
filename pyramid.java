package pattern;

public class pyramid {

	public static void main(String[] args) {
		    char ch='a';
		    
		   for(int r = 1; r <= 3; r++) {
	            
	           
	            for (int s = 2; s >= r; s--) {
	                System.out.print(" ");
	            }
	        
	            for (int c = 1; c <= r; c++) {
	            	System.out.print(ch+ " ");
	       
	           
	        }
	            System.out.println();
	            ch++;
	            
	    }
	}
	}
