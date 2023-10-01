package fast.slow.pointers;

public class HappyNumberBetterSolution {
    public static void main(String[] args) {
        System.out.println(happyNumber(25));
    }

    public static int sumOfSquaredDigits(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            res += (int) +(Math.pow(temp, 2));
        }
        return res;
    }

    public static boolean happyNumber(int n) {
        int slow = n, fast = sumOfSquaredDigits(n);

        while (fast != 1 && fast != slow) {
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(sumOfSquaredDigits(fast));
        }

        return fast == 1;
    }
}
