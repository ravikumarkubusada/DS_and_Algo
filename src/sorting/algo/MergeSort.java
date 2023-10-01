package sorting.algo;

//https://www.geeksforgeeks.org/merge-sort/
public class MergeSort {

	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
//		create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		int i, j;

		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}

		i = 0;
		j = 0;

		// Initial index of merged
		// subarry array
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements
		// of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements
		// of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	public static void sort(int[] arr, int l, int r) {

		if (l < r) {
			int m = l+ (r-l)/2;
			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}

	}
}
