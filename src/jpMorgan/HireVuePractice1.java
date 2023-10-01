package jpMorgan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HireVuePractice1 {

	public static void main(String[] args) {
		// find kth smallest element in the array
		int k = 3;
		Integer[] arr = { 1, 2, 3, 4, 5, 3, 4, 5 };

		Set<Integer> hs = new HashSet<>(Arrays.asList(arr));
		TreeSet<Integer> ts = new TreeSet<>(hs);
		
		System.out.println(ts.toArray()[k-1]);
	}
}
