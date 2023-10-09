package com.kodnest.Student;

public class HumanStudentApp {
	public static void main(String[] args) {
		Human human = new Human();
		
//		Composition
		human.heart.setColor("Red");
		human.heart.setWeigth(500);
		human.brain.setColor("Pink");
		human.brain.setWeigth(900);
		
		System.out.println(human.heart.getColor());
		System.out.println(human.heart.getWeigth());
		System.out.println(human.brain.getColor());
		System.out.println(human.brain.getWeigth());
		
//		System.out.println("Human is destroyed");
//		human = null;
//		
//		System.out.println(human.heart.getColor());
//		System.out.println(human.heart.getWeigth());
//		System.out.println(human.brain.getColor());
//		System.out.println(human.brain.getWeigth());
		
		System.out.println("=========================================");
		
//		Composition
		Student stu = new Student();
		stu.brain.setColor("pink");
		stu.brain.setWeigth(800);
		stu.heart.setColor("Red");
		stu.heart.setWeigth(600);
		
		System.out.println(stu.heart.getColor());
		System.out.println(stu.heart.getWeigth());
		System.out.println(stu.brain.getColor());
		System.out.println(stu.brain.getWeigth());
		
		System.out.println("=============================");
		
//		stu = null;
//		
//		System.out.println(stu.heart.getColor());
//		System.out.println(stu.heart.getWeigth());
//		System.out.println(stu.brain.getColor());
//		System.out.println(stu.brain.getWeigth());
		
		Car c = new Car();
		c.setBrand("Audi");
		c.setColor("Black");
		c.setCost(400000);
		
//		Handling Aggregation for Car
		c.engine.setType("petrol");
		c.engine.setHP(500);
		
//		stu.HasCar(c);
		System.out.println(c.engine.getHP());
		System.out.println(c.engine.getType());
		
//		stu = null;
	}
}
