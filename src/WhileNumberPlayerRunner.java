import java.util.Scanner;

public class WhileNumberPlayerRunner {

	public static void main(String[] args) {
		int[] bis = { 2, 2, 2, 2 };
		System.out.println(bis[1]);
		String someString = "This is a lot of text again";

		for (int i = 0; i < someString.length(); i++) {
			System.out.println(someString.charAt(i));
		}

		WhileNumberPlayer run = new WhileNumberPlayer(99);

		run.printCubesUptoLimit();
		System.out.println();
		for (int i = 1; i <= 20; i += 1) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.printf(i + " ");

		}

		int numb = -1;
		Scanner no = new Scanner(System.in);
		do {
			if (numb != -1) {
				System.out.println("cube is " + (numb * numb * numb));
			}
			System.out.print("Please enter a number ");
			numb = no.nextInt();
		} while (numb > 0);

		System.out.println("Thank you have fun !");
	}

}
