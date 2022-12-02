package com.mockito;

public class Calculator {

	CalculatorService service;
	public Calculator(CalculatorService service) {
		this.service=service;
	}
	
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public int mul(int num1, int num2) {
		return num1*num2;
	}


	public int testPerformAdd(int i, int j) {
		return i+j;
	}
	
	public int testPerformSub(int i, int j) {
		return i-j;
	}
	public int testPerformMul(int i, int j) {
		return i*j;
	}
	
}
