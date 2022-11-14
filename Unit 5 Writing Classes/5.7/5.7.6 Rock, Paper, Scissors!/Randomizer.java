//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        return (int)(Math.random() * (10) + 1);
    }
    
    public static int nextInt(int min, int max)
    {
        return (int)(Math.random() * (max - min) + min);
        //Implement this method to return a random integer between min and max
    }
}