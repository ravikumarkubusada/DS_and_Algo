package hackerRank;

import java.util.Arrays;
import java.util.Comparator;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] c = { "Bangalore", "Pune", "San Fancisco", "New York City" };
		MySort ms = new MySort();

		Arrays.sort(c, ms);
		System.out.println(Arrays.binarySearch(c, "New York City"));

	}

	static class MySort implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}

	}

}
