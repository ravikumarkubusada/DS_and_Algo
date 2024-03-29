package two.pointer.problems;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Is the given String palindrome?" +  pal("seses"));
    }

    private static boolean pal(String str) {
        int s = 0;
        int e = str.length() -1;

        while (s < e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
