package com.basic.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* 
  public class PredicateDemo implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if(t%2==0) return true;
		return false;
	}
    public static void main(String []args) {
    	Predicate<Integer> predicate = new PredicateDemo();
    	System.out.println(predicate.test(11));
    	System.out.println(predicate.test(10));
	}
*/  



/*
public class PredicateDemo {
	public static void main(String []args) {
	Predicate<Integer> predicate = (t) -> t%2==0;
	System.out.println(predicate.test(11));
	System.out.println(predicate.test(10));
	
	List<Integer> numberList= Arrays.asList(1,2,3,4,5);
    numberList.stream().filter(predicate).forEach((t) -> System.out.println("Printing :"+ t));
	}
 */ 



 public class PredicateDemo {
	public static void main(String []args) {
	List<Integer> numberList= Arrays.asList(1,2,3,4,5);
    numberList.stream().filter((t) -> t%2==0).forEach((t) -> System.out.println("Printing :"+ t));
	}
}
