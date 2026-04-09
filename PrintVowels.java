package string;

public class PrintVowels {
    public static void main(String[] args) {
    
    	String dem = "Hello, find all the vowel in this statement";
        
    System.out.print("Vowels found : ");

        for (int a = 0; a < dem.length(); a++) 
        
   {
           char vow = dem.charAt(a);

            if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') {
              
            	System.out.print(vow + "  ");
      }
        }
    }
 }