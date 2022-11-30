package com.basic.ref.constructor;

public class Student {

	 public Student() {
		 System.out.println("Creating object of student class");
	 }
	
	 public void display() {
		 System.out.println("This is a student");
	 }
	 
	 
	 public void display(String name, String Stander) {
		System.out.println("The student name is "+name);
		System.out.println("This is a student");
		System.out.println("The student stander is "+ Stander);
	 }
}
