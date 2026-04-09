package one;

public class find {

    static int a[] = {22, 33, 44, 55, 66};
    static int num = 44;

    public static void main(String[] args) {

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == num)
            {
                System.out.println("Number found at index: " + i);
                break;
            }
        }
    }
}

