import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("First Int: ");
        int in1 = input.nextInt();
        System.out.print("Second Int: ");
        int in2 = input.nextInt();
        
        double dub1 = (double) in1;
        double dub2 = (double) in2;
        
        double output = dub1/dub2;
        
        System.out.println(output);
    }
}