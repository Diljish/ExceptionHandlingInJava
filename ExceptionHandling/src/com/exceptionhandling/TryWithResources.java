package com.exceptionhandling;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {

		try(Scanner scanner = new Scanner(System.in)){
			int[] numbers = {1,2,3,4};
			int number = numbers[5];
		}
		
	}

}
