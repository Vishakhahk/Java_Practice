package two;

public class anyprog
{
	public static void main(String[] args)
	{
	 int arr[] = {10,20,30,40,50};
	 int tar = 0;
	  
	 for(int i=0; i<arr.length;i++)
	 {
		 if(arr[i] == tar)
		 {
			 System.out.println("element fount at index " +i);
		 }
			 
	 }
	 System.out.println("not found");
}
}