import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Fraction frac1 = new Fraction(1, 2);
        
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Please input numerator: ");
        int numerator = input.nextInt();
        
        System.out.println("Please input denominator: ");
        int denominator = input.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction frac2 = new Fraction(numerator, denominator);
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int outputNumerator = (frac1.getNumerator() * frac2.getDenominator() + frac1.getDenominator() * frac2.getNumerator());
        int outputDenominator = (frac1.getDenominator() * frac2.getDenominator());
        
        Fraction frac3 = new Fraction(outputNumerator, outputDenominator);
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        System.out.println(frac1 + " + " + frac2 + " = " + frac3);
    }
}