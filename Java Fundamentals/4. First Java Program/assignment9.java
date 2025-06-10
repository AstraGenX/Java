// To find Armstrong Number between two given number.
import java.util.Scanner;
public class assignment9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end=sc.nextInt();
        System.out.println("Armstrong numbers between "+start+" and "+end+" are:");
        for(int num=start; num<=end; num++) 
        {
            int sum=0, temp=num, digits=String.valueOf(num).length();
            while(temp>0) 
            {
                int digit=temp%10;
                sum+=Math.pow(digit, digits);
                temp/=10;
            }
            if(sum==num) 
            {
                System.out.println(num);
            }
        }
        sc.close();
    }
}