package two.pointer.problems;

public class ValidPalindrome {
    public static void main(String[] args) {

        System.out.println("Is the given String palindrome? \nAnswer: " +  palindromeCheck("sesRQes"));
    }

    private static int palindromeCheck(String str) {
        int low = 0, high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                if (isPalindrome(str, low+1, high))
                    return low;
                else if (isPalindrome(str, low, high-1)) {
                    return high;
                }
                return -2;
            }

        }
        return -1;
    }
        private static boolean isPalindrome(String str, int low, int high) {

            while (low < high) {
                if(str.charAt(low) != str.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            }
            return true;
        }
}
