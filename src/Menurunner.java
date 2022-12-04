import java.util.Scanner;

public class Menurunner {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Please enter number1 = ");
		int number1 = scan1.nextInt();

		System.out.print("Please enter second number :");
		int number2 = scan1.nextInt();

		System.out.print("Please enter operation number to proceed \n" + "1 -ADD\n" + "2 - subtract\n" + "3 - divide \n"
				+ "4 - multiply\n" + "choose operation:");

		int operation = scan1.nextInt();
		System.out.println("Your entered number1 is - " + number1);
		System.out.println("your entered number is- " + number2);
		System.out.println("choosed operation= " + operation);

		if (operation == 1) {
			System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
		} else if (operation == 2) {
			System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
		} else if (operation == 3) {
			System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
		} else if (operation == 4) {
			System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
		} else {
			System.out.println("please provide a valid operation");
		}

	}

}
