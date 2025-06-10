// Input currency in rupees and output in USD.
import java.util.Scanner;
public class assignment6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter amount in Rupees (INR): ");
        double inr=sc.nextDouble();

        // Conversion rate (example: 1 INR = 0.012 USD)
        double conversionRate=0.012; // Update this based on the latest exchange rate

        // Converting to USD
        double usd=inr*conversionRate;

        // Displaying result
        System.out.println("Equivalent amount in USD: $" + usd);

        sc.close();
    }
}
