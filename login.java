package linking;
import java.util.*;
class register
{
	int id;
	String username;
	String pass;
	double sal;
	register(int id, String username, String pass, double sal)
	{
		this.id=id;
		this.username=username;
		this.pass=pass;
		this.sal=sal;
	}
	void show()
	{
		System.out.println(id);
		System.out.println(username);
		System.out.println(pass);
		System.out.println(sal);
	}
}

public class login
{
	
	int eid;
	 register ref;
	 
	login(int eid, register ref)
	{
		this.eid=eid;
		this.ref=ref;
			}
	
	void showing()
	{
		System.out.println(eid);
		System.out.println(ref);
	}
	
public static void main(String[] args) 
	{
	
	ArrayList a1= new ArrayList();
	Object o1;
	
	
			register jk = new register(106,"kumbhar vishakha", "@VCC123", 20000);
			login ll = new login(202, jk);
			jk.show();
			ll.showing();
		
	}
	
}


