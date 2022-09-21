import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        
        System.out.println("First Number:");
        double num1 = input.nextDouble();
        
        System.out.println("Second Number:");
        double num2 = input.nextDouble();
        
        calc.sum(num1, num2);
        calc.divide(num1, num2);
        calc.multiply(num1, num2);
        calc.subtract(num1, num2);
    }
}