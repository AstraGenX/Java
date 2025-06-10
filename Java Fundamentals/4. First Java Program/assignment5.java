// Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking two numbers as input
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        // Finding the largest number using if conditions
        if (num1>num2) {
            System.out.println("The largest number is: "+num1);
        } else if (num2>num1) {
            System.out.println("The largest number is: "+num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
