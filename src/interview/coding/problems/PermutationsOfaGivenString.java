package interview.coding.problems;

import java.util.Scanner;

public class PermutationsOfaGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str = sc.next();

		System.out.print("\nAll possible strings are : ");
		permute(str, "");
	}

	private static void permute(String str, String answer) {
		if (str.length() == 0) {
			System.out.print(answer + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String l_subStr = str.substring(0, i);
			String r_subStr = str.substring(i + 1);
			String rest = l_subStr + r_subStr;

			permute(rest, answer + ch);
		}

	}

}
