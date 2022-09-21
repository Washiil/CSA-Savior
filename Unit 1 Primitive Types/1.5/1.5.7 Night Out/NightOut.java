import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much did dinner cost?");
        double dinner = input.nextDouble();
        System.out.println("How much is laser-tag for one person?");
        double laserTag = input.nextDouble();
        System.out.println("How much did ice cream cost?");
        double iceCream = input.nextDouble();
        double total = dinner + dinner*2 + 2*laserTag + iceCream + iceCream/3;
        System.out.println("Dinner: " + dinner);
        System.out.println("Golf: " + laserTag);
        System.out.println("Dessert: " + iceCream);
        System.out.println("Grand Total: $" + total);
    }
}