import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {

		int[] number8 = { 23, 45, 21, 45, 21, 45, 256, 5 };
		Arrays.fill(number8, 123);
		for (int i = number8.length - 1; i >= 0; i -= 1) {
			System.out.println(number8[i]);
		}
		for (int i : number8) {
			System.out.println(i);
		}

		int[] marks1 = new int[4];
		Scanner check = new Scanner(System.in);
		marks1[0] = check.nextInt();
		marks1[1] = check.nextInt();
		System.out.println(Arrays.toString(marks1));

		int[] marks = { 75, 60, 56 };
		System.out.println(marks.length);
		int sum=0;
		for(int i =0;i<marks.length;i++) {
			sum = sum + marks[i];
		}
		System.out.println(sum);
	}
}