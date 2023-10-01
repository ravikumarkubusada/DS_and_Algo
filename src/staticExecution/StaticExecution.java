package staticExecution;

public class StaticExecution {
/*
*
* Important:
* Identification of static members from top to bottom
* Execution static variable assignment and static blocks from top to bottom
* Execution of main method
*
* */
    static int i=10;
    static {
        m1();
        System.out.println("First static block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }

    public static void m1() {
        System.out.println("m1 static method"+ j);
    }

    static {
        System.out.println("Second static block");
    }

    static int j =20;
}
