package general;

import java.lang.annotation.Native;

import static java.lang.Float.NaN;

public class Operators {

    public static void main(String[] args) {
        int x =1;
        System.out.println("post:"+ x++);
        System.out.println("pre:"+ ++x);

        final int y=1;

        byte b = y+1;
        System.out.println(b);

        System.out.println(b/0.0);

        System.out.println(0/0.0 == NaN);

        System.out.println(new String() == null);


        switch (x) {
            default:
                System.out.println("default");

            case 0:
                System.out.println("0");

            case 1:
                System.out.println("1");
                break;

        }

/*        for(;;) {
            System.out.println("for");
        }*/
        
        final int at = 0;
        System.out.println(at);

    }
}
