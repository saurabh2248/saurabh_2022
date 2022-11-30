package com.basic.ref.constructor;

public class ConsMain {
	public static void main(String[] args) {
		
		System.out.println("We are student cons ref");
		IStudent iStudent = ()-> new Student();
		
		Student student1 = iStudent.getStudent();
		student1.display();
		
		
	
		
		
	}
}
