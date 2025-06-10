//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Checking if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        sc.close();
    }
}

