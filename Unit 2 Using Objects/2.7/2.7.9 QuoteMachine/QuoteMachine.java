import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a quote
        System.out.println("Enter a quote:");
        String quote = input.nextLine();
        // Ask for the author
        
        System.out.println("Enter the author of the quote:");
        String author = input.nextLine();
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        System.out.println(author + "\n\"" + quote + "\"\n" + author);
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
    }
}