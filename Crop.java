package three;
 //MULTILEVEL INHERITANCE
 class Multilevel
{
     void show()
     {
	System.out.println("this is parent class");
     }
     
}
class A extends Multilevel
{
	void grow()
    {
	System.out.println(" class A ");
    }
}
class B extends A
{
	void take()
    {
	System.out.println(" class B ");
    }
}
class C extends B
{
	void more()
    {
	System.out.println(" class C");
    }
}
class Crop extends C
{
	public static void main(String[] args)
	{
		Crop crp = new Crop();
		crp.show();
		crp.grow();
		crp.take();
		crp.more();
	}
}
