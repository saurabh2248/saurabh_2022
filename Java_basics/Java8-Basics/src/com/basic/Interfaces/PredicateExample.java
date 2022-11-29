package com.basic.Interfaces;

import java.util.function.Predicate;

public class PredicateExample {
	 public static void main(String[] args) {
		Predicate<Integer> p1 = num-> (num>20);
		System.out.println(p1.test(11));
	 }
}
