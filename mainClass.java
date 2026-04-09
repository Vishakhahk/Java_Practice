package three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import one.Manager;
import two.managerConfig;

public class mainClass {

	public static void main(String[] args) {
		
		 ApplicationContext  c1 = new AnnotationConfigApplicationContext(managerConfig.class);

		 Manager m1 = (Manager)c1.getBean("disp");
		 
		 m1.display();
	}

}
