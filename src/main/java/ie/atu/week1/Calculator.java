package ie.atu.week1;

import java.util.Scanner;
import static java.lang.Math.exp;

public class Calculator {
    public static void main(String[] args){

        System.out.println("Please enter 1st number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
        System.out.println("Please enter 2nd number: ");
    int b = sc.nextInt();
        System.out.println("Please enter an operation: ");
    String op = sc.next();
        switch(op)

    {
        case "add":
            add(a, b); break;

        case "subtract":
            subtract(a, b); break;

        case "multiply":
            multiply(a, b); break;

        case "divide":
            divide(a, b); break;

        case "exponential": exp(a, b); break;
    }

}
        public static void add(int a, int b) {
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        }
            public static void subtract(int a, int b){
                int minus = a - b;
                System.out.println("The total is: " + minus);
        }

    public static void multiply(int a, int b){
        int product = a * b;
        System.out.println("The total is: " + product);
    }

    public static void divide(int a, int b){
        int division = a / b;
        System.out.println("The total is: " + division);
    }

    public static void exp(double a, double b) {
        double exp = Math.exp(a - b);
        System.out.println("The exp is: " + exp);
    }


}


