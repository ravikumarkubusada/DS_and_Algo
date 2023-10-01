package queue.arrayImpl;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 0 && i != arr.length - 1) {
				
				
				for(int j=arr.length-1; j>i+1; j--) {
					arr[j]=arr[j-1];
				}
				
				/*
				 * int j = i + 1; while (j < arr.length && j < arr.length - 1) { arr[j + 1] =
				 * arr[j]; j++; }
				 */
				arr[i + 1] = 0;
				i++;

			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
