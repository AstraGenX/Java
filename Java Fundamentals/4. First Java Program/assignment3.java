// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter Principal amount (P): ");
        double principal=sc.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time=sc.nextDouble();

        System.out.print("Enter Rate of interest (R): ");
        double rate=sc.nextDouble();
        // Calculating Simple Interest
        double simpleInterest=(principal*time*rate)/100;
        // Displaying result
        System.out.println("Simple Interest: "+simpleInterest);
        sc.close();
    }
}
