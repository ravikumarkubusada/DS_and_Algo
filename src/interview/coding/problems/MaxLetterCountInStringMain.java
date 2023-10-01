package interview.coding.problems;

public class MaxLetterCountInStringMain {

	public static void main(String[] args) {
		String input = "aaaabbbbbbbsssssssssssssssss";
		int count = 1;
		int localCount = 1;
		char maxChar = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i - 1) == input.charAt(i)) {
				localCount++;
				continue;
			} else {
				if (localCount > count) {
					count = localCount;
					maxChar = input.charAt(i - 1);
				}
			}

			localCount = 1;
		}

		if (localCount > count) {
			count = localCount;
			maxChar = input.charAt(input.length() - 1);
		}

		System.out.println("Max char = " + maxChar);

	}

}
