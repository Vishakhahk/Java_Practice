package Ocean;

interface RBI
{
	int a=10000;                 //by default method are public static final
	public static final int b = 200;   
	void deposit();
	public abstract void kyc();
	 void banktrans();                   //by default method are public abstract
}
class HDFC implements RBI
{
	public void deposit() {
		
		System.out.println("deposit from hdfc");	
	System.out.println(RBI.a);
	}
	public void kyc() {
		System.out.println(a);
		
	}

	
	public void banktrans() {
		
	}
	
}
class SBI implements RBI
{
	public void deposit() {
		
		System.out.println("deposit from sbi");
		System.out.println(RBI.a);
		System.out.println(SBI.a);
	}

	
	public void kyc() {
		
	}

	
	public void banktrans() {
		
	}
	
}
class ICICI implements RBI
{
	public void deposit() {
		
		System.out.println("deposit from icici");
		System.out.println(RBI.a);
		System.out.println(RBI.b);
	}

	
	public void kyc() {
		
	}

	
	public void banktrans() {
		
	}
	
}
public class Banking {

	public static void main(String[] args) {
		SBI r1 = new SBI();
		r1.deposit();
		System.out.println(r1);
		
		HDFC h1 = new HDFC();
		h1.deposit();
		
		ICICI cc = new ICICI();
		cc.deposit();
		
		

	}

}
