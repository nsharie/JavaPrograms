package com.kodnest.polymorphism;

public class Deer extends Animal{
	@Override
	public void eat() {
		System.out.println("Deer will eat grass");
	}
	
	@Override
	public void sleep() {
		System.out.println("Deer will sleep on baren lands");
	}
	
	@Override
	public void foodHabitat() {
		System.out.println("Deer is Herbivorous");
	}
}
