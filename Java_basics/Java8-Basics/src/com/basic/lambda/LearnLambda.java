package com.basic.lambda;

public class LearnLambda {
 public static void main(String args[]) {
	 LearnLambda	learn1 = new LearnLambda();
	 MathOperation  add = (Integer num1, Integer num2) -> num1+num2;
	 MathOperation  sub = (Integer num1, Integer num2) -> num1-num2;
	 MathOperation  mul = (Integer num1, Integer num2) -> num1*num2;
	 MathOperation  div = (Integer num1, Integer num2) -> num1/num2;
	 
	 
	 System.out.println("Addition of two number 100, 50 =" +learn1.operation(100, 50));
	 
 }

private String operation(int x, int y) {
	return null ;
}
}
