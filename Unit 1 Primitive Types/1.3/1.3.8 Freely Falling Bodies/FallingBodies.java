public class FallingBodies
{
    public static void main(String[] args)
    {
        double gravity = 9.8;
        double time = 23;
        double height = 0.5 * gravity * (time * time);
        double velocity = gravity * time;
        
        System.out.println("The height = " + height);
        System.out.println("The velocity = " + velocity);
    }
}