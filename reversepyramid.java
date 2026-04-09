package pattern;

import java.util.Scanner;

public class reversepyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number  ");
	    int n = sc.nextInt();
	    
	    char ch='d';
	    
		   for(int r = n; r >= 1; r--) {
	            
	           
	            for (int s = 2; s >= r; s--) {
	                System.out.print(" ");
	            }
	        
	            for (int c = 1; c <= r; c++) {
	            	System.out.print(ch+ " ");
	       
	           
	        }
	            System.out.println();
	            ch--;
	            
	    }

	}

}
