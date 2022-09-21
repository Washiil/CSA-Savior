import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        String word1 = input.nextLine();
        // Scramble it
        WordGames game = new WordGames(word1);
        String test = game.scramble();
        
        // Print out scrambled word
        System.out.println(test);
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        // Add random word at index
        // Print out the word
        
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        
        
        
    }
}