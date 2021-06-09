package queue.arrayImpl;

public class DoubleExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfExist(new int[] { 0,0 }));
	}

	public static boolean checkIfExist(int[] arr) {
		int num;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i] * 2;
			if (findNum(num, arr, i)) {
				return true;
			}
		}

		return false;
	}

	public static boolean findNum(int num, int[] arr, int startPos) {

//         for(int i=0; i<arr.length;i++) {
//             if(i != startPos && arr[i] == num)
//                 return true;
//         }
		
		int i = 0;
		int j = arr.length - 1;

		while (j >= i) {

			if ((i != startPos && j != startPos) && (arr[i] == num || arr[j] == num))
				return true;
			i++;
			j--;
		}

		return false;
	}

}
