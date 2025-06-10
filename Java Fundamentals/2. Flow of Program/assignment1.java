// Input a year and find whether it is a leap year or not.
import java.io.*;
import java.util.*;
public class assignment1 {
    public static void main(String[] args) 
    {
        System.out.println("Input a year:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0)
        System.err.println("It is a Leap year");
        else
        System.out.println("It is not a Leap year");
    }
    
}
