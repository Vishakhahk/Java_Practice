package linking;


class shape {
 
	int edge;
	String sname;
	String type;
	void demo(int edge, String sname, String type)
	{
		this.edge=edge;
		this.sname=sname;
		this.type=type;
	}
}
 class Square
 {
	  int area;
	 shape sap;
	  
	  void soft(int area, shape sap)
	   {
		   this.area=area;
		   this.sap=sap;
	   }
	   void display()
	   {
		   int ans= area*area;
		   System.out.println("area of sq" +ans);
		   System.out.println("shape class values are" + sap.edge +" "+ sap.sname +" "+ sap.type);
	   }
	   
	 public static void main(String[] args)
	 {
		
		 shape g1 = new shape();
		 g1.demo(4,"square", "2 d shape");
		 
		 Square mop = new Square();
		 mop.soft(6, g1);
		 mop.display();
	  
	 	 
	 }
 }
