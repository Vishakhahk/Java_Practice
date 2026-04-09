package BlueOcean;


abstract class sello
{
	 public abstract void show();
	 void get()
	 {
		 System.out.println("non abstract method");
	 }
	 
	 abstract void mop();
	 abstract void set();
}
class book extends sello
{


	public void show() {
		
		System.out.println("show");
	}

	
	void mop() {
		
		System.out.println("mop");
		
	}

	
	void set() {
		
		System.out.println("Set");
		super.get();
	}
	
	
}
class hide extends book
{

	public static void main(String[] args) {
		hide h1 = new hide();
		h1.get();
		h1.mop();
		h1.set();
		h1.show();

	}

}
