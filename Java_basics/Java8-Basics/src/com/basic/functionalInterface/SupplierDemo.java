package com.basic.functionalInterface;

import java.util.function.Consumer;

public class SupplierDemo {

	public static void main(String []args) {
		Consumer<Integer> consumer= (t) ->
		    System.out.println("Printing :"+ t);
		    consumer.accept(5000);
	}

}
