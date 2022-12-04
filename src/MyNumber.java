
public class MyNumber {
	private int number;

	MyNumber(int number) {
		this.number = number;
	}

	boolean isPrime() {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

	int sumUptoN() {
		int total = 0;
		for (int i = 1; i <= number; i++) {
			total = total + i;
		}
		return total;
	}

	int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;

			}
		}
		return sum;

	}

	void printANumberTriangle() {
		for (int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");

			
			}
			System.out.println();
	}


}
	

}
