package queue.arrayImpl;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = new int[] { 0,0,0,0,0 };
		int[] n2 = new int[] { 1,2,3,4,5 };
		merge(n1, 0, n2, 5);
		System.out.println(Arrays.toString(n1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m != 0) {
			outer: for (int i = 0; i < n; i++) {

				for (int j = 0; j < m; j++) {
					if (nums2[i] < nums1[j]) {
						shiftToRight(nums1, j);
						nums1[j] = nums2[i];
						continue outer;
					}
				}

				nums1[n + i] = nums2[i];
			}
		} else {
			nums1 = nums2;
		}
	}

	public static void shiftToRight(int[] arr, int startPos) {
		for (int j = arr.length - 1; j > startPos; j--) {
			arr[j] = arr[j - 1];
		}
	}
}
