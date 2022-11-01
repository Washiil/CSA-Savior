import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        Scanner input = new Scanner(System.in);
        
        String password = input.nextLine();
        // to the passwordCheck method to determine if it is valid.
        System.out.println(passwordCheck(password));
    }
    
    public static boolean passwordCheck(String password)
    {
        String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        
        if (password.length() < 8) return false;
        
        for (int i = 0; i < password.length(); i++)
        {
            char letter = password.charAt(i);
            System.out.println(letter + " : " + validChars.indexOf(letter));
            if (validChars.indexOf(letter) == -1) return false;
        }
        return true;
    }
}
