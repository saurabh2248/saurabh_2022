package com.basic.Interfaces;

interface manufacturing {
	void made();
}

interface sales{
	void sold();
}
public class Product implements sales, manufacturing {
	public static void main(String[] args) {
		Product soap= new Product();
		soap.sold();
		soap.made();
	}
	
	@Override
	public void made() {
		System.out.println("The product has been made");
	}
	
	@Override
	public void sold() {
		System.out.println("The product can be sold");
	}
}
