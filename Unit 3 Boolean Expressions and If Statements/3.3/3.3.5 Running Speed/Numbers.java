import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start by making comments to outline the logic of your program
        Scanner input = new Scanner(System.in);
        System.out.println("How fast can you run a mile? ");
        
        int time = input.nextInt();
        
        if (time < 223)
        {
            System.out.println("Are you sure? That's a new world record!");
        }
        else
        {
            System.out.println("Right on! Keep running!");
        }
    }
}