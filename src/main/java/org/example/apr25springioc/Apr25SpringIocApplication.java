package org.example.apr25springioc;

import org.example.apr25springioc.config.AppConfig;
import org.example.apr25springioc.utility.AppUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class Apr25SpringIocApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Apr25SpringIocApplication.class, args);

//		Car z4 = context.getBean("BMWZ4",Car.class);
//		System.out.println(z4);

		AppUtils utils = context.getBean(AppUtils.class);
		System.out.println(utils);

		/*

		Maserati gts500 = new Maserati(new PetrolEngine(450), "gts500", 2025);
		System.out.println(gts500);

		Car Z4 = new Car("BMW","Z4",2025);
		System.out.println(Z4);
*/
/*
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car Z4 = context.getBean("Z4",Car.class);
		System.out.println(Z4);
*/

		/*
		Car M4 =  context.getBean("M4",Car.class);
		System.out.println(M4);
		*/

//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		/*	List

		System.out.println("***Cars in the List***");

		List<Car> carList = (List<Car>) context.getBean("carList");
		System.out.println(carList);

		*/

		/*  Map
		System.out.println();
		System.out.println("***Cars in the Map***");

		Map<String, Car> carMap = (Map<String, Car>) context.getBean("carMap");
		for (Car car : carMap.values()) {
			System.out.println(car);
		}

		*/

		/* Set
		System.out.println("***Cars in the Set***");

		Set<Car> carSet = (Set<Car>) context.getBean("carSet");
		for (Car car : carSet) {
			System.out.println(car);
		}

		*/
		/* config
		System.out.println();
		ConfigurableApplicationContext configContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = (Car) configContext.getBean("BMWZ4",Car.class);
		System.out.println(car);


		context.close();
		*/
	}
}