// Take 2 numbers as inputs and find their HCF and LCM.
import java.io.*;
import java.util.*;
public class assignmnet4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int a = num1, b = num2;
        // Finding HCF using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        // Finding LCM
        int lcm = (num1 * num2) / hcf;

        // Printing results
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
        
        sc.close();
    }
}
