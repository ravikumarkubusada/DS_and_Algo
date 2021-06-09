package interview.coding.problems;

import java.util.Scanner;

public class NumberOfUniquePaths {

//	https://practice.geeksforgeeks.org/problems/number-of-unique-paths5339/1/?company[]=Walmart&page=1&query=company[]Walmartpage1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // test cases

		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(uniquePaths1(a, b));
			System.out.println(uniquePaths2(a, b));
		}
	}
// solution1: o(a*b) -> time Complexity 
// this is easy solution where i[1][1] = i[1][0] + i[0][1];
	public static int uniquePaths1(int a, int b) {

		int dp[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
				}
			}
		}

		return dp[a-1][b-1];
	}

//Solution 2 : tricky solution
	public static int uniquePaths2(int a, int b) {
		// Answer is simply (a + b) C (min (a, b))
		// But first make a and b have top left point as (0, 0)
		--a;
		--b;

		// Calculate (a + b) C (min(a, b))
		return nCk(a + b, Math.min(a, b));
//		return a;
	}

	private static int nCk(int n, int k) {
		int res = 1;

		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

}
