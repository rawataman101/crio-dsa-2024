package foundation;

import java.io.*;
import java.util.*;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		int minLen = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minLen) {
				minLen = strs[i].length();
			}
		}

		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < minLen; i++) {
			char c = strs[0].charAt(i);
			for (String str : strs) {
				if (str.charAt(i) != c) {
					return sb.toString();
				}
			}
			sb.append(c);
		}
		return sb.toString();

	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] strings = in.readLine().split(" ");
		String prefixString = new LongestCommonPrefix().longestCommonPrefix(strings);
		System.out.print(prefixString);
	}
}
