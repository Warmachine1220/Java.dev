import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
	int x = 5;

	void Create() {
		this.x = 34;

	}

	List<Integer> haha = List.of(21, 3, 21, 23, 1);
	List<Integer> ar1 = new ArrayList<>(haha);

	public static void main(String[] args) {

		Exercises.check();

		int a = 12;
		int b = 22;

		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println(a + "=a , b=  " + b);

		String str = "geeks start for";

		String[] splittedString = str.split(" ");
		for (String p : splittedString) {
			System.out.print(p);
		}
		System.out.println();
		String nstr = "";
		char ch;

		StringBuilder asd = new StringBuilder();
		for (int i = 0; i < splittedString.length; i++) {
			asd.append(splittedString[i]);
			asd.reverse();
			System.out.println(asd);

		}
		// asd.append(str);
		// asd.reverse();
		// System.out.println(asd);

		// System.out.println(nstr);

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int[] num = { 23, 42, 423, 4323, 44, 1 };
		System.out.println(num[0]);
		Arrays.sort(num);
		System.out.println(num[0]);
		String gg = "thisishello";
		for (int i = gg.length() - 1; i >= 0; i--) {

			if (i == 0) {
				System.out.print(gg.charAt(i));
			}
			else {

			System.out.print(gg.charAt(i) + "_");
			}
		}
		System.out.println();
		Integer bish = Integer.valueOf("34");
		int sum = bish + 34;
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.plusDays(100));
		LocalDateTime time = LocalDateTime.now();
		LocalDateTime time1 = time.plusHours(5);
		System.out.println(time1.plusMinutes(20));
		System.out.println(time);

		char c1 = '9';
		System.out.println((int) c1);
		Practice myObj1 = new Practice(); // Object 1
		Practice myObj2 = new Practice(); // Object 2
		myObj2.x = 25;

		System.out.println(myObj1.x); // Outputs 5
		System.out.println(myObj2.x); // Outputs 25

		MyChar char1 = new MyChar('p');
		System.out.println(char1.isVowel());
	}

}


