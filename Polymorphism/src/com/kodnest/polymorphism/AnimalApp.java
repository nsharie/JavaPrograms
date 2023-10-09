package com.kodnest.polymorphism;

public class AnimalApp {
	public static void main(String[] args) {
		AnimalKingdom.acceptAnimal(new Tiger());
		AnimalKingdom.acceptAnimal(new Deer());
		AnimalKingdom.acceptAnimal(new Monkey());
		
	}
}
