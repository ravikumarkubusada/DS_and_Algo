package interview.coding.problems;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str = "abba";

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");

	}

	private static boolean isPalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			j--;
			i++;
		}

		return true;
	}

}
