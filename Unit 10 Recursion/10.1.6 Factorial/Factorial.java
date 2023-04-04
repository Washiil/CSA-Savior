import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        System.out.println(calcFactorial(number));
    }
    
    public static int calcFactorial(int x)
    {
        if (x == 0)
        {
            return 1; //Base condition
        }
        else
        {
            return x * calcFactorial(x-1);
        }
    }
}