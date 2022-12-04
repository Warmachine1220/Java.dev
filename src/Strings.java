
public class Strings {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;

		for (int i = 1; i <= 12; i += 1) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		String str = ("I AM AWSOME");
		String final1 = str.concat("added");
		System.out.println(final1);
		Integer no1 = Integer.valueOf("564353");
		int ff = no1 + 44;

		System.out.println(ff);

	}

}
