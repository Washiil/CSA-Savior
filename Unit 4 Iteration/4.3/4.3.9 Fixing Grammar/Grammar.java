import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        String sentence = input.nextLine();
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        String properSentence = useProperGrammar(sentence);
        System.out.println(properSentence);
    }
    
    public static String useProperGrammar(String theText)
    {
        String output = "";
        int errors = 0;
        
        for (int i = 0; i < theText.length(); i++)
        {
            String letter = theText.substring(i, i + 1);
            if (letter.equals("2"))
            {
                output += "to";
                errors++;
            } else {
                output += letter;
            }
        }
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        System.out.println("Fixed " + errors + " grammatical errors:");
        return output;
    }
}