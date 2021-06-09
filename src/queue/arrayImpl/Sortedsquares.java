package queue.arrayImpl;

import java.util.Arrays;

import sorting.algo.MergeSort;

public class Sortedsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 1, 2, 3, 4 };

		System.out.println(sortedSquares(input).toString());

		MergeSort.sort(sortedSquares(input), 0, input.length - 1);
		
		System.out.println(input.toString());
		
		Arrays.stream(input).forEach(n -> System.out.println(n));

	}

	public static int[] sortedSquares(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}
		return nums;
	}
}
