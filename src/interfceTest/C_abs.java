package interfceTest;

public abstract class C_abs implements ITest{
    protected int c_var;

    public C_abs(int i) {
        this.c_var = i;
    }

    public abstract void cAbsMethod();
}
