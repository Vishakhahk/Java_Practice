package Parrot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Ostrich.POJO;

@Configuration
public class JAVA_BASED_CONFIG {
	 
	@Bean
	public POJO t1()
	{
		POJO p = new POJO();
		p.setId(101);
		p.setName("Vishakha");
		p.setEmail("Vishakha@gmail.com");
		return p;
		
	}

}
