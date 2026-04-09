package MainFlamingo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import Parrot.JAVA_BASED_CONFIG;

public class runningprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JAVA_BASED_CONFIG.class);
		 Parrot.JAVA_BASED_CONFIG c = context.getBean(JAVA_BASED_CONFIG.class);
		 Ostrich.POJO p1 = c.t1();
		 p1.show();
	}

}
