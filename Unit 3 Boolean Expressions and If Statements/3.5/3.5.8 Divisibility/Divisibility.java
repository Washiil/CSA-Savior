import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the dividend: ");
        int dividen = input.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();
        
        if (divisor != 0 && dividen % divisor < 1)
        {
            System.out.println(dividen + " is divisible by " + divisor + "!");
        }
        else
        {
            System.out.println(dividen + " is not divisible by " + divisor + "!");
        }
    }
}
