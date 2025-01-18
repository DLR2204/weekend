package exceptions;

public class Exception2 {

	public static void main(String[] args) {

		try {

			int arr[] = new int[5];// 0,1,2,3,4

			arr[9] = 30 / 0;

			String name = "apple";

			int x = Integer.parseInt(name,28);

			System.out.println("17.no error  :- " + arr[3]);

			System.out.println("19."+x);

		} catch (ArithmeticException e) {
			System.out.println("22.Please don't enter 0 as the denominator");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("23.Please give the right index number");
		} catch (NumberFormatException e) {
			System.out.println("25.Please give the radix number");
		}

		catch (Exception e) {
			System.out.println("30." + e);
		}

		System.out.println("33.Remaning 10,000 lines of code");
	}

}
