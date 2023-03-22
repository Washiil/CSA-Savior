public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object first = new Object();
        Object second = first; 
        Object third = new Object(); 
        
        // Print out all three objects
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        // Print a true statement using 2 objects and ==
        System.out.println("First and Second are equal: " + (first == second));
        
        // Print a false statement using 2 objects and ==
        System.out.println("First and Third are equal: " + (first == third));
        
        // Print a true statement using 2 objects and .equals()
        System.out.println("First and Third are equal: " + (first.equals(second)));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println("First and Second are equal: " + (first.equals(third)));
        
        System.out.println("** Ball **");
        
        
        Ball golfball = new Ball(1.5); 
        Ball minigolf = golfball; 
        Ball largeGolf = new Ball(1.5); 
        
        // Print out all three objects
        System.out.println(golfball);
        System.out.println(minigolf);
        System.out.println(largeGolf);
        
         // Print a true statement using 2 objects and ==
         System.out.println("Golfball and Minigolf are equal: " + (golfball == minigolf));
        
        // Print a false statement using 2 objects and ==
        System.out.println("Golfball and LargeGolf are equal: " + (golfball == largeGolf));
        
        // Print a true statement using 2 objects and .equals()
        System.out.println("Golfball and Minigolf are equal: " + (golfball.equals(minigolf)));
        
        // Print a false statement using 2 objects and .equals()
        System.out.println("Golfball and LargeGolf are equal: " + (golfball.equals(largeGolf)));

    }
}