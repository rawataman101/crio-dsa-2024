package crio.dsa2;

import java.util.*;

class Student {
	int id;
	String name;
	int marks[] = new int[5];

	public Student(int id, String name, int marks[]) {
		this.id = id;
		this.name = name;

		for (int i = 0; i < 5; i++) {
			this.marks[i] = marks[i];
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}

}

public class MarksSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Student arr[] = new Student[n];

		for (int i = 0; i < n; i++) {

			int id = sc.nextInt();
			String name = sc.next();
			int marks[] = new int[5];

			for (int j = 0; j < 5; j++)
				marks[j] = sc.nextInt();
			arr[i] = new Student(id, name, marks);
		}

		int res[] = marksSort(n, arr);

		for (int j : res) {
			System.out.print(j + " ");
		}
	}

	static int[] marksSort(int n, Student arr[]) {
		int ans[] = new int[n];
		Arrays.sort(arr, (Student o1, Student o2) -> {
			int sumA = 0, sumB = 0;
			for (int i = 0; i < 5; i++) {
				sumA += o1.marks[i];
				sumB += o2.marks[i];
			}
			if (sumA != sumB)
				return sumB - sumA;
			if (o1.name.equals(o2.name) == false)
				return o1.name.compareTo(o2.name);
			return o1.id - o2.id;
		});
		for (int i = 0; i < n; i++) {
			ans[i] = arr[i].id;
		}
		return ans;

	}
}
