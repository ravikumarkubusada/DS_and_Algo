package interview.coding.problems;

import java.util.Scanner;

class SticklerThief {

	public static void findMax(int[] arr, int n) {
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = arr[0];
		for (int i = 2; i <= n; i++) {
			System.out.println(i);
			f[i] = Math.max(arr[i - 1] + f[i - 2], f[i - 1]);
			System.out.println("F=: " + f[i]);
		}
		System.out.println(f[n]);
	}

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of test cases T

		while (n-- > 0) {
			int a = sc.nextInt();
			System.out.println("a=" + a);// number of houses
			int arr[] = new int[a]; // money array
			for (int i = 1; i < a - 1; i++) {
				arr[i] = sc.nextInt();
			}

			findMax(arr, a);

		}

	}
}