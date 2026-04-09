package Ocean;

interface transaction
{
	void phonepay();
	void atm();
	void passbook();
}
class MyBank implements transaction
{

	public void phonepay()
	{
		System.out.println("phonepay method called");
	}
	public void atm()
	{
		System.out.println("atm method called");
	}
	public void passbook()
	{
		System.out.println("passbook smethod called");
		
	}
	MyBank()
	{
		System.out.println(" cohi");
	}
	
	public static void main(String[] args) {
		MyBank bnk = new MyBank();
		bnk.phonepay();
		bnk.atm();
		bnk.passbook();
		new MyBank();

	}

}
