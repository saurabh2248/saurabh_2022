package com.basic.functionalInterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PredicateDemo {
	public static void main(String []args) {
		//Consumer<Integer> consumer= (t) -> System.out.println("Printing :"+ t);
	    // consumer.accept(5000);
		    
		    List<Integer> numberList= Arrays.asList(1,2,3,4,5);
		    numberList.stream().forEach((t) -> System.out.println("Printing :"+ t));
		    
	}
}
