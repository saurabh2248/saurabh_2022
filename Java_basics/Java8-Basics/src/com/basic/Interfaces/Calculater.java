package com.basic.Interfaces;

interface Operations {
	void add();
	void sub();
	void mul();
	void div();
	
	static Integer adding(Integer x, Integer y) {return x+y;};
	static Integer subtract(Integer x, Integer y) {return x+y;};
	static Integer multiply(Integer x, Integer y) {return x*x;};
	static Integer division(Integer x, Integer y) {return x/y;};
}

public class Calculater {
    public static void main(String[] args) {
    	Operations s=  new SqauareOf1();
    	s.add();
    	System.out.println(Operations.adding(20, 10));
    	s.sub();
    	System.out.println(Operations.subtract(20, 10));
    	s.mul();
    	System.out.println(Operations.multiply(20, 10));
    	s.div();
    	System.out.println(Operations.division(20, 10));
    }
}

class SqauareOf1 implements Operations{
	@Override
	public void add() {
		System.out.print("Sum:");
	}
	
	@Override
	public void sub() {
		System.out.print("Diff:");
	}
	
	@Override
	public void mul() {
		System.out.print("Mul:");
	}
	
	@Override
	public void div() {
		System.out.print("Div:");
	}
}
