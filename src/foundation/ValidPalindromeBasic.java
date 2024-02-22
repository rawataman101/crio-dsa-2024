package foundation;

import java.io.*;
import java.util.*;

public class ValidPalindromeBasic {
	public String isPalindrome(String s) {
		String modString = s.replaceAll("[^a-zA-Z0-9]", "");

		String revString = "";
		for (int i = modString.length() - 1; i >= 0; i--) {
			revString += modString.charAt(i);
		}
		if (revString.equalsIgnoreCase(modString)) {
			return "true";
		} else {
			return "false";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();

		String result = new ValidPalindromeBasic().isPalindrome(line);
		System.out.print(result);
	}
}
