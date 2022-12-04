import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

	Student(String name, int... listOfMarks) {
		this.name = name;
		for (int i : listOfMarks) {
			this.listOfMarks.add(i);

		}
	}

	int getNumberOfmarks() {
		return listOfMarks.size();

	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int i : listOfMarks) {
			sum = sum + i;
		}
		return sum;
	}

	void removeMark(int i) {
		int y = listOfMarks.indexOf(i);
		listOfMarks.remove(y);
	}

	int getMaximumMark() {
		return Collections.max(listOfMarks);
	}

	int getMinimumMark() {
		return Collections.min(listOfMarks);
	}

	BigDecimal getAverageMarks() {

		BigDecimal average = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfmarks()), 3,
				RoundingMode.UP);
		return average;
	}

	public String toString() {
		return name + listOfMarks;
	}

	public void addNewMark(int i) {
		// TODO Auto-generated method stub
		listOfMarks.add(i);

	}
}
