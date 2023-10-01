package two.pointer.problems;

import java.util.Arrays;
import java.util.Collections;

public class SumOfThree {
    public static void main(String[] args) {
        Integer[] input = new Integer[]{3, 7, 1, 2, 9, 4, 5};
//         Arrays.sort(input, Collections.reverseOrder());
        sortTheArray(input);
        Arrays.stream(input).forEach(e -> System.out.println(e));

        boolean found = findSumOfThree(input, 22);
        System.out.println(found);
    }

    private static boolean findSumOfThree(Integer[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            int left = i+1;
            int right = input.length-1;
            while(left < right) {
                int triplets = input[i]+input[left]+input[right];
                if( triplets== target)
                    return true;
                if(triplets < target)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }

    private static Integer[] sortTheArray(Integer[] input) {
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }


        }

        return input;
    }
}
