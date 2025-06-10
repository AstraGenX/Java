// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking inputs
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator=sc.next().charAt(0);

        double result=0;

        // Using if conditions to perform calculations
        if(operator=='+') {
            result=num1+num2;
        } else if(operator=='-') {
            result=num1-num2;
        } else if(operator=='*') {
            result=num1*num2;
        } else if(operator=='/') {
            if(num2!=0) {
                result=num1/num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operator! Please enter +, -, *, or /.");
            sc.close();
            return;
        }

        // Displaying the result
        System.out.println("Result: " + result);
        sc.close();
    }
}
