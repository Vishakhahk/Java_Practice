package pattern;
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Rhombus: ");
        int n = sc.nextInt();
        
        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop to print the stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}
