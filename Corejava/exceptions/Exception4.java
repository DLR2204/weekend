package exceptions;

class AgeNotValidException extends Exception {

	int age;

	public AgeNotValidException() {

	}

}

public class Exception4 {

	public static void validation(int age) throws AgeNotValidException {
		if (age > 18) {
			System.out.println("You are eligible to vote");
		} else {
			throw new AgeNotValidException();
		}
	}

	public static void main(String[] args) throws AgeNotValidException {
		validation(1);
	}

}
