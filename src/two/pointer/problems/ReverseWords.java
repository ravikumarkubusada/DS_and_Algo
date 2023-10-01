package two.pointer.problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {

        String revString = reverseWords("hey hello world");
        System.out.println(Arrays.stream(revString.split(" ")).map(ReverseWords::reverseWords).collect(Collectors.joining(" ")));

    }

    public static String reverseWords(String inputStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = inputStr.length()-1; i >= 0; i--) {
            sb.append(inputStr.charAt(i));
        }
        return sb.toString();
    }
}
