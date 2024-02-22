package foundation;

import java.io.*;
import java.util.*;

public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0) {
			return ans;
		}
		int n = matrix.length;
		int m = matrix[0].length;
		// define
		int left = 0;
		int right = m - 1;
		int top = 0;
		int bottom = n - 1;

		while (top <= bottom && left <= right) {
			// left to right
			for (int i = left; i <= right; i++) {
				ans.add(matrix[top][i]);
			}
			top++;

			// top to bottom
			for (int i = top; i <= bottom; i++) {
				ans.add(matrix[i][right]);
			}
			right--;

			// right to left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					ans.add(matrix[bottom][i]);
				}
				bottom--;
			}

			// bottom to top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					ans.add(matrix[i][left]);
				}
				left++;
			}

		}

		return ans;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] matrix = new int[n][m];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

		for (int i = 0; i < result.size(); ++i) {
			System.out.printf("%d ", result.get(i));
		}
	}
}
