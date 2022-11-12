import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Food hamburger = new Food("hamburger", 600);
        Food fries = new Food("hamburger", 350);
        Food coke = new Food("coke", 200);
        
        System.out.println("Hamburgers have 600 calories.\nHow many would you like?");
        int numHam = input.nextInt();
        
        System.out.println("French Fries have 350 calories.\nHow many would you like?");
        int numFries = input.nextInt();
        
        System.out.println("Coke have 200 calories.\nHow many would you like?");
        int numCoke = input.nextInt();
        
        int totalCalories = (hamburger.getCalories() * numHam) + (fries.getCalories() * numFries) + (coke.getCalories() * numCoke);
        
        System.out.println("Your meal with have a total of " + totalCalories + " calories");
    }
}