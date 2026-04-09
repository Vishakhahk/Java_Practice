package two;

class Venom {
    String color;

    Venom(String c) {
        this.color = c;
    }

  
    Venom(Venom other) {
        this.color = other.color; 
    }
}

public class COPYCONS {
    public static void main(String[] args) {
        Venom v1 = new Venom("Black"); 
        
        Venom v2 = new Venom(v1);     
        
        System.out.println(v2.color); 
        System.out.println(v1);
    }
}
