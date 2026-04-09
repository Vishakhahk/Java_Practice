package linking;


class Engine
{
	void start()
	{
		System.out.println("engine has started");
	}
}
class car
{
	Engine er = new Engine();
	void display()
	{
		System.out.println("car class method");
		er.start();       //calling engine class method with refrence
	}
}
public class mainProg {

	public static void main(String[] args) {
		car ct = new car();
		ct.display();

	}

}
