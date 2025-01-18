package exceptions;

public class Exception3 {

	public static void main(String[] args) {
		
		try {
			int x= 20/0;
			
		}catch(NumberFormatException e) {
			System.out.println("The denominator is zero");
		}
		finally {
			
			System.out.println("Hello Everyone.Im from the finally block...");
		}
		
	}
}
