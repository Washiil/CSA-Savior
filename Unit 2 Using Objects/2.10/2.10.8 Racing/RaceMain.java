public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        
        double accel1 = 1000;
        double accel2 = 500;
        
        // Create two Racecar objects
        
        Racecar car1 = new Racecar(accel1, "Imagine getting second");
        Racecar car2 = new Racecar(accel2, ":(");
        
        // Compute the finishing times for both cars
        
        double time1 = car1.computeTime(distance);
        double time2 = car2.computeTime(distance);
        
        // Print times of each car
        
        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");
    }
}