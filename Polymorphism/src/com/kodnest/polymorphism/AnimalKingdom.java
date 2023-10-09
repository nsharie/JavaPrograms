package com.kodnest.polymorphism;

public class AnimalKingdom {
	public static void acceptAnimal(Animal ref) {
		ref.eat();
		ref.sleep();
		ref.foodHabitat();
		System.out.println("=============================");
	}
}
