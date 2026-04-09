package Apple;

/**
 * Simple example class for the Apple package.
 */
public class AppleExample {
    public static void main(String[] args) {
        System.out.println("Hello from AppleExample");
        int value = 5;
        System.out.println("helper(" + value + ") = " + helper(value));
    }

    // Simple helper method used by main
    public static int helper(int x) {
        return x * x;
    }
}
