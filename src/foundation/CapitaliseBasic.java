package foundation;

import java.util.*;

public class CapitaliseBasic {
	// NOTE: Please do not modify this function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String captStr = capitalise(str);
		System.out.println(captStr);
	}

	static char convertToUpperCase(char c) {
		return (char) (c - 32);
	}

	// TODO: Implement this method
	static String capitalise(String str) {
		// covert to char array
		char[] arr = str.toCharArray();
		// check the first char
		if (arr[0] >= 'a' && arr[0] <= 'z') {
			arr[0] = convertToUpperCase(arr[0]);
		}
		// iterate the remaining array
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == ' ' || arr[i - 1] == '.') {
				if (arr[i] >= 'a' && arr[i] <= 'z') {
					arr[i] = convertToUpperCase(arr[i]);
				}
			}
		}
		return new String(arr);
	}
}

/*
 * Steps: 1. identify the first character of a word
 * 
 * 2. identify if it's lowercase or uppercase
 * 
 * 3. convert it into uppercase
 * 
 * Complexity:
 * 
 * Optimization:
 */