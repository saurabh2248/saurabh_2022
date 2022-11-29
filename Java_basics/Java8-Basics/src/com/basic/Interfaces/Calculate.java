package com.basic.Interfaces;

interface Sqauare{
	void sqare();
	static Integer Sq(Integer x) {return x*x;};
}

public class Calculate {
    public static void main(String[] args) {
    	Sqauare s1= new SqauareOf10();
    	s1.sqare();
    	System.out.println(Sqauare.Sq(10));
    }
}

class SqauareOf10 implements Sqauare{
	@Override
	public void sqare() {
		System.out.println("Square of the number is:");
	}
}
