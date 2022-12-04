import java.math.BigDecimal;
import java.util.Arrays;

public class Studentrunner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] days = { "Sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}
		Arrays.sort(days);

		System.out.println(days[days.length - 1]);
		String max = "";
		for (String i : days) {
			if (max.length() < i.length()) {
				max = i;
			}
		}
		System.out.println(max);
		Student student = new Student("vishal", 96, 23, 43, 12, 32, 99, 455);
		System.out.println(student.getMaximumMark());
		System.out.println(student.getMinimumMark());
		BigDecimal gg = student.getAverageMarks();
		System.out.println(gg);
		System.out.println(student);
		student.addNewMark(345);
		System.out.println(student);
		student.removeMark(23);
		System.out.println(student);

	}

}