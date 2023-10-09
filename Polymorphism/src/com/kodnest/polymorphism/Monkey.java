package com.kodnest.polymorphism;

public class Monkey extends Animal {
	@Override
	public void eat() {
		System.out.println("Monkey will steal and eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Monkey will sleep in the tress");
	}
	
	@Override
	public void foodHabitat() {
		System.out.println("Monkey is Omnivourous");
	}
}
