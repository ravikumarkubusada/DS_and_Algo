package var_args;

public class Test {

    public static void main(String[] args) {

        int[] a = new int[]{1,3,4};
        int[] b = new int[]{10,20,40};
        varArg(a,b);
    }

    public static void main(int[] args) {

    }
    public static void varArg(int[] ...x) {
        for(int[] a : x) {
            System.out.println(a[0]);
        }
    }
}
