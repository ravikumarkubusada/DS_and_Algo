package interview.coding.problems;

import java.util.Scanner;

public class JosephusProblem {
//REF: https://www.youtube.com/watch?v=uCsD3ZGzMgE&feature=youtu.be

	public static void main(String[] args) {
		String binaryString = "";
		System.out.print("Number of soldgers = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] array = Integer.toBinaryString(n).toString().split("");

		for (int i = 1; i < array.length; i++) {
			binaryString = binaryString + array[i];
		}

		binaryString = binaryString.concat(array[0]);

		int decimal = Integer.parseInt(binaryString, 2);

		System.out.println("Joseph's position should be: " + decimal);

	}
}
