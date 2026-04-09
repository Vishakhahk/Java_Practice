package poly;

class SBIBank
{
	private int bamount=10000;	
	public int getBAmout() // Getter
	{
		return bamount;
	}	
	
}
class W
{
	SBIBank s1=new SBIBank();
	public void withdrawn(int wamout)
	{
		int x=s1.getBAmout()-wamout;
		int a=s1.getBAmout()+wamout;
		System.out.println("Total Amount is " + x);
		System.out.println("Total Amount is " + a);
	}
	
	
}
public class Movie
{
 
	public static void main(String[] args)
	{
		W w1 = new W();
		w1.withdrawn(5000);
		
	}
 
}
 
