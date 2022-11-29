package com.basic.functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
   
	public static void main(String []args) {
		Consumer<Integer> consumer= (t) ->
		    System.out.println("Printing :"+ t);
		    consumer.accept(5000);
	}
}
