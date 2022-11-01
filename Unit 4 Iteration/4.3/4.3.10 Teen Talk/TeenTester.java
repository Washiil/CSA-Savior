import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        
        // Ask the user to input a text message
        String msg = input.nextLine();
        // Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(msg));
    }
}