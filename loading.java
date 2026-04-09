package poly;


public class loading
{
	int x;
	String y;
	void show(int x, String y)
	{
		this.x=x;
		this.y=y;
	}
	
	void show(String y, int x)
	{
		this.y=y;
		this.x=x;
	}
	void display()
	{
		System.out.println(x +" "+ y);
		
	}
	public static void main(String[] args) 
	{
			loading r1 = new loading();
		r1.show(106, "vishakha kumbhar");
		r1.show("namefirst", 23);
		r1.display();
	}

}
