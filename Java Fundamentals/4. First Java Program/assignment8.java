// To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class assignment8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String reversed=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reversed)) 
        {
            System.out.println(str+" is a Palindrome.");
        } 
        else 
        {
            System.out.println(str+" is NOT a Palindrome.");
        }
        sc.close();
    }
}
