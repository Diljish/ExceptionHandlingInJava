package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {

		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			int[] numbers = {1,2,3,4};
			int number = numbers[5];
			
		}catch(Exception e ) {
			
		}finally {
			scanner.close();
		}
		
		
		
		
	}

}
