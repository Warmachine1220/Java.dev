
public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		for (i = 15; i >= 5; i -= 1) {
			System.out.print(i + " ");
		}
		String p = (i > 5 ? "true" : "Falsehihi");
		System.out.println("\n" + p);

		System.out.println(isWeekDay(0));
		System.out.println(determineNameOFMonth(6));
		System.out.print(determinNumberOfDay(4));
	}

	static void check() {
		System.out.println("pass");
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		default:
			return true;
		}

	}

	public static String determineNameOFMonth(int monthNumber) {
		String str;
		switch (monthNumber) {
		case 1:
			str = "Janvuary";
			break;
		case 2:
			str = "feb";
			break;
		case 3:
			str = "march";
			break;
		case 4:
			str = "april";
			break;
		case 5:
			str = "may";
			break;
		case 6:
			str = "june";
			break;
		case 7:
			str = "july";
			break;
		case 8:
			str = "august";
			break;
		case 9:
			str = "september";
			break;
		case 10:
			str = "october";
			break;
		case 11:
			str = "november";
			break;
		case 12:
			str = "december";
			break;
		default:
			str = "enter valid";
		}
		return str;
	}

	public static String determinNumberOfDay(int dayNumber) {
		String str;
		switch (dayNumber) {
		case 0:
			str = "sunday";

		case 1:
			str = "monday";
			break;
		case 2:
			str = "tuesday";
			break;
		case 3:
			str = "wednesday";
			break;
		case 4:
			str = "thursday";
			break;
		case 5:
			str = "friday";
			break;
		case 6:
			str = "saturday";
			break;
		default:
			str = "enter valid";

		}
		return str;
	}

}
