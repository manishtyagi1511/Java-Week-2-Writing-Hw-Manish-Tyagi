package homeowork_week_6;

import java.util.Scanner;

public class Programme_5_Calculator {

    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division
     * methods all with parameters and use string concatenation methods.
     * (Note: Two static and Two instance methods.)
     */

    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of" + a + " and " + b + " is  :" + result);

    }

    public static int subtraction(int a, int b) {
        return a - b;

    }

    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("the multiplication of " + a + " and " + b + " is :" + result);

    }

    public int division(int a, int b) {
        int result = a / b;
        return a / b;

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = obj.nextInt();
        System.out.println("Please enter second number");
        int b = obj.nextInt();


        addition(a, b);

        int result = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is :" + result);

        Programme_5_Calculator obj1 = new Programme_5_Calculator();
        obj1.multiplication(a, b);

        int divResult = obj1.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);



obj.close();

    }


}
