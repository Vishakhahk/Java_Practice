package string;

public class ReverseString {

	public static void main(String[] args)
	{
	
String gr = "string stringbuffer stringbuilder stringtokenizer";
int count = 0;
for(int i = 0; i < gr.length(); i++)
{
	if(gr.charAt(i) == ' ')
	{
		count++;
	}
}
	
System.out.println("total is " +count);
}
}
