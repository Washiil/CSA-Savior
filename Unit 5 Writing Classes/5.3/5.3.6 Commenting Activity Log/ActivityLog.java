public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
     * @param hours number of hours to be added
     * @return void
     * Sets the value of hours within the class
    **/
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
     * @param miles number of miles to be added
     * @return void
     * Set the value of miles within the class
    **/
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
     * @return double
     * Returns the number of miles
    **/
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
     * @return double
     * Returns the total number of hours
    **/
    public double getHours() 
    {
        return numHours;
    }
    
}