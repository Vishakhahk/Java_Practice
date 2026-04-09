package poly;

// overriding concept (inheritance compulsory)
class parent
{
	void sound()
	{
		System.out.println("dog barking sound here");
	}
}

 class riding extends parent
 {
      
	 void sound()
	 {
		 super.sound();           
		 System.out.println("Lion roaring sound here");
	 }
	
	public static void main(String[] args) {
		
              riding rt = new riding();
              rt.sound();
	}

}
