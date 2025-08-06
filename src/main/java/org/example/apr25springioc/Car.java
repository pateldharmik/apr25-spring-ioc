package org.example.apr25springioc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Car {

	private String make;

	private String model;

	private Integer year;

//	private Set<Car> cars;

	public void establishConnection(){
		System.out.println("Connection to the database established");
	}

	public void destroyConnection(){
		System.out.println("Connection to the database destroyed");
	}
}
