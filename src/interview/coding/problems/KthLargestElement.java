package interview.coding.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
//	https://practice.geeksforgeeks.org/problems/kth-largest-element-in-a-stream/0

//	solutions: https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 4, 6, 9, 3, -1 };
		int k = 2;

		Arrays.stream(arr).forEach(System.out::println);
		System.out.println(k + "th smallest " + KthSmallestElement1(arr, k));
		System.out.println(k + "th smallest " + KthSmallestElement2(arr, k));
		System.out.println(k + "th lagest: " + KthLargestElement(arr, k));
	}

//	solution1: easy but more time complexity O(N Log N)
	public static int KthSmallestElement1(Integer[] arr, int k) {
		Arrays.parallelSort(arr);
		return arr[k - 1];
	}

//	solution 2: using min/max heap 
	public static int KthSmallestElement2(Integer[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (Integer a : arr) {
			pq.add(a);
		}
		k = k - 1;
		while (k-- > 0) {
			pq.poll();
		}

		return pq.peek();
	}

	public static int KthLargestElement(Integer[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (Integer a : arr) {
			pq.add(a);
		}
		k = k - 1;
		while (k-- > 0) {
			pq.poll();
		}

		return pq.peek();
	}

//	solution 3: using QuickSelect, complexity of this method is O(n2), but it works in O(n) on average.
}
