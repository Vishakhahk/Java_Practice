package Ocean;

interface addition
{
	void add();
}
interface substraction
{
	void subs();
}
interface multiplication
{
	void mul();
}
interface division
{
	void div();
}
public class calculation implements addition,substraction, multiplication, division
{

	public int a = 10, b=5,c;
	public void add()
	{
		
		c=a+b;
		System.out.println(c);
	}
	public void subs()
	{
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		calculation cl = new calculation();
		cl.add();
		cl.div();
		cl.subs();
		cl.mul();
       
	}

}
