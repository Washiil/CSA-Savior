import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Calculator c = new Calculator();
        
        System.out.println("Enter two doubles");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        System.out.println(num1 + " + " + num2 + " = " + c.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + c.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + c.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + c.divide(num1, num2));
        
    }
}