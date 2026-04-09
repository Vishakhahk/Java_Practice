package pattern;

public class pascal {

	public static void main(String[] args) 
	{
		for(int r=1; r<=3;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=2; r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
