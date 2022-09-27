public class MicrowaveCooking
{
    public static void main(String[] args)
    {
        // Generate a random number of seconds
        int secs = (int)(90 + (Math.random()*150+1));
        System.out.println(secs);
        // Print the number of seconds
        if (secs <= 120) {
            System.out.println("Rolls will be the right temperature!");
        }
        else {
            System.out.println("Rolls will be boiling hot!");
        }
        // Use two if statements to print the temperature
    }
}