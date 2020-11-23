package com.exceptionhandling;

public class ExceptionHandlingRunner_2 {

	public static void main(String[] args) {
		
		methode1();
	}
	public static void methode1() {
		methode2();
		
	}
	public static void methode2() {
		try {
//			String name = null;
//			name.length();
			int [] i = {1,2};
			int number = i[3];
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
