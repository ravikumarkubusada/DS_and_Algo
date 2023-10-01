package jpMorgan;

import java.util.Scanner;

public class HireVuePractice2 {

	public static void main(String[] args) {

		// A string is provided as input from console which consist of integer values .
		// Insert * if subsequent numbers are even
		// insert - if subsequent numbers are odd
		// input = 21462675756 o/p: 214*6*2*67-5-7-7-56
		// input = 98676555533 o/p: 98*6765-5-5-5-3-3

		Scanner s = new Scanner(System.in);

		String str = s.next();

		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < str.length() - 2; i++) {
			
			if (((Integer.valueOf(str.charAt(i+1)) % 2) == 0) && ((Integer.valueOf(str.charAt(i)) % 2) == 0)) {
				sb.append(str.charAt(i)).append("*");
			} else if((((Integer.valueOf(str.charAt(i +1)) % 2) != 0) && ((Integer.valueOf(str.charAt(i)) % 2) != 0))) {
				sb.append(str.charAt(i)).append("-");
			} else
				sb.append(str.charAt(i));
		}
		sb.append(str.charAt(str.length()-1));
		System.out.println(sb.toString());
	}
}
