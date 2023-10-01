package interfceTest;

public class Main {
    public static void main(String[] args) {

        System.out.println(ITest.abc);

        ITest iTest = new NormalClass();
        iTest.iTestMethod();

        NormalClass normalClass = new NormalClass();
        normalClass.cAbsMethod();

        A_abs a = new B_abs();
        a.marry();
        A_abs.marryStatic(10);
    }
}
