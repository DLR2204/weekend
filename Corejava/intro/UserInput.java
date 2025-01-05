package intro;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name :- ");
		
		String name = scan.next();
		
		System.out.println("Hello "+ name +"!....Welcome to the Application");
		
	}

}
