package foundation;

import java.io.*;
import java.util.*;

public class RotateImage {
	public void rotateImage(int[][] matrix) {

	}

	static void swap(int[][] arr, int a, int b) {
		int temp = arr[a][b];
		arr[a][b] = arr[b][a];
		arr[b][a] = temp;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int matrixSize = scanner.nextInt();
		int[][] matrix = new int[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; ++i) {
			for (int j = 0; j < matrixSize; ++j) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		new RotateImage().rotateImage(matrix);
		for (int i = 0; i < matrixSize; ++i) {
			for (int j = 0; j < matrixSize; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
