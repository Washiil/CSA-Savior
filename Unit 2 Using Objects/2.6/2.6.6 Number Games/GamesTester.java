public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        double num;
        // Square the number
        num = game.squareNumber();
        // Print it out
        System.out.println(num);
        
        // Double the number
        num = game.doubleNumber();
        // Print it out
        System.out.println(num);
        
        // Square the number again
        num = game.squareNumber();
        // Print it out
        System.out.println(num);
        // Get the number and store the value
        num = game.getNumber();
        // Print out your stored value 
        System.out.println(num);
        // Get the number again then store and print
        num = game.getNumber();
        // the value
        System.out.println(num);
        
    }
}