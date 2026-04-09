package decisionmaking;
import java.util.*;

public class array_prog {

    public static void main(String args[]) 
    {
    
    	Scanner sc = new Scanner(System.in);
    	
    	int[] val = new int[7];
    System.out.println(" enter any 7 numbers ");
    for(int i=0;i<7; i++)
    {
    	val[i]=sc.nextInt();
    	
    }
    	
    System.out.println("only even numbers in our array are:-");
    for(int i=0;i<7; i++)
    {
    	if(val[i] % 2 == 0)
    	{
    		System.out.println(val[i]);
    	}
    	
    }
    
    }
}
