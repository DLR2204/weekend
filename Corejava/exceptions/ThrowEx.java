package exceptions;

public class ThrowEx {

	public static void vote(int age) {

		if (age > 18) {
			System.out.println("You are eligible to vote");
		} else {

			throw new NumberFormatException();

		}
	}

	public static void main(String[] args) {

		vote(7);
	}
}
