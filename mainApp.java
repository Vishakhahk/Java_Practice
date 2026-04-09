package thirdcompanhy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fistcompany.CompanyLogic;

public class mainApp {
	 public class MainApp
	 {
		 public static void main(String args[]) {
			 
			 ApplicationContext c2 = new ClassPathXmlApplicationContext("secondcompany/companyXml.xml");
			 CompanyLogic CL = (CompanyLogic) c2.getBean("s1");
			 
			 
			 CL.getting();
		 }
	 }

}
