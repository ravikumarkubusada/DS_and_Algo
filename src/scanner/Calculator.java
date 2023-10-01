package scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first value:  ");
        int firstNo = input.nextInt();
        System.out.print("enter second value:  ");
        int secondNo = input.nextInt();
        System.out.println("select the operation, 1 = sum, 2 = sub , 3 =  mul, 4. =div");
        int operation = input.nextInt();
        while (true) {
            if (operation == 1 || operation == 2 || operation == 3 || operation == 4) {
                break;
            } else {
                System.out.println("invalid operation");
                System.out.println("select the operation, 1 = sum, 2 = sub , 3 =  mul, 4. =div");
                operation = input.nextInt();
            }
        }

        performOperation(firstNo, secondNo, operation);
    }

    private static void performOperation(int firstNo, int secondNo, int operation) {
        switch (operation) {
            case 1:
                System.out.println(firstNo + secondNo);
                break;
            case 2:
                System.out.println(firstNo - secondNo);
                break;
            case 3:
                System.out.println(firstNo * secondNo);
                break;
            case 4:
                System.out.println(firstNo / secondNo);
                break;
            default:
                System.out.println("invalid operation");

        }
    }
}
