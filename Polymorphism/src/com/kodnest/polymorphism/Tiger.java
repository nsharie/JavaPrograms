package com.kodnest.polymorphism;

public class Tiger extends Animal {
	@Override
	public void eat() {
		System.out.println("Tiger will hunt and eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Tiger will sleep in den");
	}
	
	@Override
	public void foodHabitat() {
		System.out.println("Tiger is Carnivorous");
	}
}	
