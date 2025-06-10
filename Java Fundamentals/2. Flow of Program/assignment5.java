// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class assignment5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) 
        {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) 
            {
                break;
            }
            try 
            {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }
        System.out.println("Total sum: " + sum);
        sc.close();
    }
}
