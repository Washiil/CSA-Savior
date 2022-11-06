public class ActivityTracker
{
    public static void main(String[] args)
    {
        // New class for our activity log
        ActivityLog mylog = new ActivityLog();
        
        // Add miles to the class
        mylog.addMiles(5);
        mylog.addHours(1);
        
        // Get and print out total miles
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        // Get hours from mylog class
        double hoursToday = mylog.getHours();
        
        // add hours of double type
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        // Get the logged hours and subtract the hours today
        double increase = mylog.getHours() - hoursToday;
        
        // Print out our formatted results
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}