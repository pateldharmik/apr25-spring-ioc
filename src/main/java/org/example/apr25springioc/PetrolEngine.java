package org.example.apr25springioc;

import lombok.ToString;

@ToString
public class PetrolEngine implements IEngine {

	private String engineName = "Petrol Engine";
	private Integer horsePower;

	public PetrolEngine(Integer horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public void display() {
		System.out.println("Engine Type: " + engineName + " horsePower: " + horsePower);
	}

}
