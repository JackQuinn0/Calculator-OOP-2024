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
    }

}
        public static void add(int a, int b){
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        }


}


