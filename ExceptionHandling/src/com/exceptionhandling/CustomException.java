package com.exceptionhandling;

class CustomExceptionCreates extends Exception {
	public CustomExceptionCreates(String messages) {
		super(messages);
	}
	
}
public class CustomException {
	
	public static void main(String args[]) throws Exception {
		String data = null;
		
		data.length();
		throw new CustomExceptionCreates("Null poiner exception");
		
	}

}
