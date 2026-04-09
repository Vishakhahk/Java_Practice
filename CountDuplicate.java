package string;

public class CountDuplicate {
    public static void main(String[] args) {
        
    	
    	String str = "vaibhav";
        
    	int duplicateCount = 0;

    for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

         
            if (str.indexOf(c, i + 1) != -1) {
                duplicateCount++;
               
            }
        }

        System.out.println("Total duplicate characters: " + duplicateCount);
    }
}

