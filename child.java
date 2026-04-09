package three;
// SINGLE INHERITANCE
 class Parent
{
    int a = 23;
  String v = "vishakha";
  
  Parent()
  {
	  System.out.println(a+ " " +v);
    }
}
class child extends Parent
{
	public static void main(String[] args)
	{
		 new child();
	}
}