package queue.arrayImpl;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2};

		removeDuplicates(nums);

		System.out.println(Arrays.toString(nums));

	}

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		int val = nums[0];
		int i = 1;
		for (int j = 1; j < nums.length; j++) {

			if (nums[j] != val) {
				val = nums[j];
				nums[i] = nums[j];
				i++;
			} else {
//				nums.length = j;
			}

		}
		return i;
	}

}
