package org.example.apr25springioc.config;

import org.example.apr25springioc.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig  {

	@Bean(initMethod = "establishConnection", destroyMethod = "destroyConnection")
	public Car BMWZ4(){
		Car bmwz4 = new Car();
		bmwz4.setMake( "BMW" );
		bmwz4.setModel( "Z4" );
		bmwz4.setYear(2025);

		return bmwz4;
	}
}
