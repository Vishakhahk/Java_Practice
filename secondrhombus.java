package pattern;

import java.util.Scanner;

public class secondrhombus 
{
 public static void main(String[] args)
 {
	 
 
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows for Rhombus: ");
    int n = sc.nextInt();
    
    for(int r=1; r<=n; r++)
    {
    	  for(int s=1;s<=r;s++)
    	  {
    		  System.out.print(" ");
    	  }
    		  
    		  for(int c=1;c<=n; c++)
    		  {
    			  System.out.print("@ ");
    		  }
    		  System.out.println();
    	  
    }
}
}