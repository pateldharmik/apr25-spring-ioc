package org.example.apr25springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Apr25SpringIocApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Apr25SpringIocApplication.class, args);
/*

		Maserati gts500 = new Maserati(new PetrolEngine(450), "gts500", 2025);
		System.out.println(gts500);

		Car Z4 = new Car("BMW","Z4",2025);
		System.out.println(Z4);
*/

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car Z4 = context.getBean("Z4",Car.class);
		System.out.println(Z4);
		Car M4 =  context.getBean("M4",Car.class);
		System.out.println(M4);

	}
}