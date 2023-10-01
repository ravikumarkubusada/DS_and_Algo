package fast.slow.pointers;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//    Write an algorithm to determine if a number
//�
//    n
//    is a happy number.
//
//    We use the following process to check if a given number is a happy number:
//
//    Starting with the given number
//�
//    n
//, replace the number with the sum of the squares of its digits.
//    Repeat the process until:
//    The number equals
//1
//        1
//        , which will depict that the given number
//�
//    n
//    is a happy number.
//    It enters a cycle, which will depict that the given number
//�
//    n
//    is not a happy number.
//    Return TRUE if
//            �
//    n
//    is a happy number, and FALSE if not.

    public static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(isHappyNumber(25));
    }
    public static boolean isHappyNumber(int n) {
        int slow = n, fast = 0;

        while (n > 0) {
            int rem = n%10;
            fast = fast + rem*rem;
            n = n/10;
        }

        if(fast == 1)
            return true;
        else {
            if(set.contains(fast)) {
                return false;
            }else {
                set.add(fast);
                isHappyNumber(fast);
            }
        }
        return false;
    }
}
