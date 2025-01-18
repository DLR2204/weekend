package exceptions;

import java.io.FileNotFoundException;

public class ThrowsEx {
	
	public static void div(int a,int b) throws ArithmeticException,FileNotFoundException{
		System.out.println("The result is :- "+(a/b));
	}
	
	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		
		div(4,0);
	}

}
