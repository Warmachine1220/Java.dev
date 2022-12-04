import java.util.Scanner;

public class Multiplicationtable {
  void print(int number) {
		print(number, 1, 10);

  }
  void print() {
	  
	  System.out.println("IF you will not provide any argumrnt then 5 table will be printed by default");
		print(5);

  }
  void print(int number,int from ,int to ) {
	  for(int i =from;i<=to;i +=1) {
		  System.out.printf("%d*%d=%d",number,i,number*i).println();
	  }
  }

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int no = num.nextInt();
		System.out.println(fact(no));

	}

	private static char[] fact(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	void Calculator() {
		Scanner scan1 = new Scanner(System.in);
		System.out.printf("Please provide 1st no:");
		Double num1 = scan1.nextDouble();
		System.out.printf("Please provide 2st no:");
		Double num2 = scan1.nextDouble();
		System.out.printf("Please provide operator from( + , - , * , /) = ");
		char operator = scan1.next().charAt(0);
		Double result;
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.printf("%f +%f = %f", num1, num2, result);
			break;
		case '-':
			System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
			break;
		case '/':
			System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
			break;
		default:
			System.out.println("You have entered wrong operator");
		}
	}


}
