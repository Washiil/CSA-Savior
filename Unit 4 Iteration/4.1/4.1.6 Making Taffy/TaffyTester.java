import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting Taffy Timer...");
       
        int i = 0;
        while(i < 270)
        {
            System.out.println("Enter the temperature: ");
            i = input.nextInt();
            
            if (i < 270) {
                System.out.println("The mixture isn't ready yet.");
            }
        }
        System.out.println("Your taffy is ready for the next step!");
    }
}
