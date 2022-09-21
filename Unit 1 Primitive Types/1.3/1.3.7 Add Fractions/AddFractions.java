public class AddFractions 
{
    public static void main(String[] args)
    {
        int numerator1 = 1;
        int denominator1 = 2;
        int numerator2 = 2;
        int denominator2 = 5;
        // --- \\
        
        int outputNumerator = (numerator1 * denominator2) + (denominator1 * numerator2);
        int outputDenominator = denominator1 * denominator2;
        
        // Output stuff \\
        System.out.println("The numerator of the first fraction is " + numerator1);
        System.out.println("The denominator of the first fraction is " + denominator1);
        System.out.println("The numerator of the second fraction is " + numerator2);
        System.out.println("The denominator of the second fraction is " + denominator2);
        System.out.println("The sum of " + numerator1 + "/" + denominator1 + " + " + numerator2 + "/" + denominator2 + " = " + outputNumerator + "/" + outputDenominator);
    }
}