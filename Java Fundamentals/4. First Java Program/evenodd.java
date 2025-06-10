//Write a program to print whether a number is even or odd, also take input from the user.
import java.io.*;
import java.util.*;
class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a Number:");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is an Even Number");
        }
        else{
            System.out.println(n+" is an Odd Number");
        }
    }

}