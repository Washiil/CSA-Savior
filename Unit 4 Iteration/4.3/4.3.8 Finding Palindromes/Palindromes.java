import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        // Create user input and let user know whether their word is a palindrome or not!
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        if(isPalindrome(word))
        {
            System.out.println("Your word is a palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome :(");
        }
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        // Your code goes here!
        String reversed = reverse(text);
        if (reversed.equals(text)) return true;
        return false;
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        // Your code goes here!
        String output = "";
        for (int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);
            output = ch + output;
        }
        return output;
    }

}