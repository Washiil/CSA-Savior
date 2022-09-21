import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Eneter the sales rax rate:");
        double salesTax = input.nextDouble();
        
        System.out.println("How many boards do you need?");
        int boards = input.nextInt();
        
        System.out.println("How many windows do you need?");
        int windows = input.nextInt();
        
        Construction c = new Construction(8, 11, salesTax);
        
        double total = c.lumberCost(boards) + c.windowCost(windows);
        
        System.out.println("Total: " + total);
        
        System.out.println("Grand Total: " + c.grandTotal(total));
    }
}