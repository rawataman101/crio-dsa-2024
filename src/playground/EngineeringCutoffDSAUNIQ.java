package playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
	public int id;
	public int threeMarks;
	public int totalMarks;

	Student() {
		this.id = 0;
		this.threeMarks = 0;
		this.totalMarks = 0;
	}

	Student(int id, int threeMarks, int totalMarks) {
		this.id = id;
		this.threeMarks = threeMarks;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", threeMarks=" + threeMarks + ", totalMarks=" + totalMarks + "]";
	}

	@Override
	public int compareTo(Student o) {

		if (o.threeMarks != this.threeMarks) {
			return Integer.compare(o.threeMarks, this.threeMarks);

		} else if (this.threeMarks == o.threeMarks) {
			return Integer.compare(o.totalMarks, this.totalMarks);
		} else {
			return Integer.compare(o.id, this.id);
		}
	}

}

public class EngineeringCutoffDSAUNIQ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[][] = new int[n][6];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int eligibleList[] = engineeringCutoff(n, a);

		for (int i = 0; i < eligibleList.length; i++) {
			System.out.print(eligibleList[i] + " ");
		}
	}

	static int[] engineeringCutoff(int n, int marksArray[][]) {
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < marksArray.length; i++) {
			int totalMarks = 0;
			int threeMarks = 0;
			boolean passedAll = true;
			for (int j = 1; j <= 5 && passedAll; j++) {
				if (marksArray[i][j] < 35) {
					passedAll = false;
				} else {
					if (j < 4) {
						threeMarks += marksArray[i][j];
					}
					totalMarks += marksArray[i][j];
				}
			}

			if (passedAll) {
				students.add(new Student(marksArray[i][0], threeMarks, totalMarks));
			}
		}
		Collections.sort(students);
		int[] ans = new int[students.size()];
		int index = 0;
		for (Student i : students) {
			ans[index++] = i.id;
		}
		return ans;
	}

}
