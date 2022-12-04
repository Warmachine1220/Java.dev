
public class WhileNumberPlayer {
	int number;

	WhileNumberPlayer(int number) {
		this.number = number;
	}

	void printSquaresUptoLimit() {
		int i = 1;
		while (i * i <= number) {
			System.out.print(i * i + " ");
			i += 1;
		}

	}

	void printCubesUptoLimit() {
		int i = 1;
		System.out.println();
		while (i * i * i <= number) {
			System.out.print(i * i * i + " ");
			i = i + 1;
		}
	}

}
