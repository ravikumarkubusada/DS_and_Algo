package coonstructor;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        try {
            method();
            System.out.println("A");
        }catch(Exception e) {
            System.out.println("B");
        }finally {
            System.out.println("c");
        }
        System.out.println("d");
    }
    
    public static void method() {}

}
