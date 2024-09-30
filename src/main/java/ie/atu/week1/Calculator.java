package ie.atu.week1;

import java.util.Scanner;

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


}


