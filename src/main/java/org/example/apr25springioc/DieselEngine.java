package org.example.apr25springioc;

import lombok.ToString;

@ToString
public class DieselEngine implements IEngine {

	private String engineName = "Diesel Engine";
	private Integer horsePower;

	public DieselEngine(Integer horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void display() {
		System.out.println("Engine Type: " + engineName + " horsePower: " + horsePower);
	}
}
