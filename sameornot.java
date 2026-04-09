package decisionmaking;

public class sameornot {

	public static void main(String[] args)
	{
		StringBuffer str =  new StringBuffer("SpringCloud hello");
		StringBuffer stgg = new StringBuffer("StringCloudOfLiteral");
		if(str == stgg)
		{
			System.out.println("both are same ");
		}
		else
		{
			System.out.println("both are not same");
		}
		
	}
}
