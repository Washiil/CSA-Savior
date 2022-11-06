import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        //Intro 
        System.out.println("Welcome to choose your own adventure!");
        System.out.print("Do you want to travel to [P]oland or [J]apan? ");
        
        //First choice: Japan or Poland
        String firstChoice = input.nextLine();
            // User Chooses Poland
            if (firstChoice.toUpperCase().substring(0,1).equals("P"))
            {
                // List Things to do/see in Atlantis
            }
           ...
            // User Chooses Japan
            if (firstChoice.toUpperCase().substring(0,1).equals("J"))
            {
                // List Things to do/see in Ribe
            }
    }
}