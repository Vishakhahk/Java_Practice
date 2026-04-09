package array_programs;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 44, 3}; 
        int target = 44;                 
        int result = -1;                 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i; 
                break;      
            }
        }

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
