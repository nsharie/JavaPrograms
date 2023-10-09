package com.kodnest.Student;

public class Student extends Human {
	
	public void HasBook(Book book) {
		System.out.println(book.author);
		System.out.println(book.book);
		System.out.println(book.price);
	}
	
	public void HasCar(Car car) {
		System.out.println(car.brand);
		System.out.println(car.color);
		System.out.println(car.cost);
	}
}
