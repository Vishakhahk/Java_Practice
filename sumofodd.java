package array_programs;

import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        int sum = 0;
        
 System.out.println("Enter 5 numbers:");
         for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) sum += num;
        }

        System.out.println("Sum of odd numbers: " + sum);
        sc.close();
    }
}
