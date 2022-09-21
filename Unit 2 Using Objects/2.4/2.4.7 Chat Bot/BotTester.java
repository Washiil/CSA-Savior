import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello! What is your name?");
        
        String name = input.nextLine();
        
        Bot bot = new Bot(name);
        
        bot.greeting();
        bot.help();
        
        System.out.println("Tell me Bot, which countries use the imperial system?");
        
        bot.imperialCountries();
        
        System.out.println("Tell me Bot, what was the first computer bug?");
    
        bot.firstBug();
        
        bot.goodbye();
    }
}