import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double doubleNumber = input.nextDouble();
        System.out.println(doubleNumber);
        int intNumber = (int)doubleNumber;
        System.out.println(intNumber);
        doubleNumber += 0.5;
        System.out.println(doubleNumber);
        intNumber = (int)doubleNumber;
        System.out.println(intNumber);
    }
}