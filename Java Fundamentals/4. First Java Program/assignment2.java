//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking name as input
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        // Printing greeting message
        System.out.println("Hello, "+name+"! I Love You");
        sc.close();
    }
}
