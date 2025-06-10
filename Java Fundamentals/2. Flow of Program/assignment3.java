// Take a number as input and print the multiplication table for it.
import java.io.*;
import java.util.*;
public class assignment3 
{
    public static void main(String[] args) 
    {
        int n,m,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input a number:");
        n=sc.nextInt();
        System.out.println("Input the limit:");
        m=sc.nextInt();
        for(i=1;i<=m;i++)
        {
            System.out.println(n+" x "+i+" = "+i*n);
        }
    }
}
