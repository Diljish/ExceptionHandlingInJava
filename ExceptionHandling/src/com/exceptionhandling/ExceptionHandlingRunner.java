package com.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		
		methode1();
	}
	public static void methode1() {
		methode2();
		
	}
	public static void methode2() {
		String name = null;
		name.length();
		
	}

}
