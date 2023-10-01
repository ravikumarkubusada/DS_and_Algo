package string;

public class StringTest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String first = "Hello";
        String second = "Hello";
        String third = new String("Hello");
        String fourth = new String("Hello");
        System.out.println(first == second);
        System.out.println(third == fourth);
        System.out.println(second == third);

    }

}
