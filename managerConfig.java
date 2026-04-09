package two;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import one.Manager;

@Configuration
public class managerConfig 
{
 
	@Bean
	public Manager disp()
	{
		
	 Manager m1 = new Manager();
	 m1.setMid(23);
	 m1.setMname("vishaka");
	 m1.setMmail("vishakha@gmail");
	 return m1;
 }

}
