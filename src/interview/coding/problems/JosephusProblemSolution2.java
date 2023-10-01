package interview.coding.problems;

import java.util.Scanner;

public class JosephusProblemSolution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println("Safe position is = " + josephus(n, k));
	}

	public static int josephus(int n, int k) {

		int out = n == 1 ? 1 : ((k + josephus(n - 1, k) - 1) % n + 1);
		System.out.println(String.format("when n=%d and k=%d, output will be = %d ", n, k, out));
		return out;
	}
}
