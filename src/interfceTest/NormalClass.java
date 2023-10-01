package interfceTest;

public class NormalClass extends C_abs implements Cloneable{

    public NormalClass() {
        super(10);
    }

    @Override
    public void cAbsMethod() {
        System.out.println("cClassMethod");
    }

    @Override
    public void iTestMethod() {
        System.out.println("iTestMethod");
    }

    @Override
    public void xAbsMethod() {

    }


}
