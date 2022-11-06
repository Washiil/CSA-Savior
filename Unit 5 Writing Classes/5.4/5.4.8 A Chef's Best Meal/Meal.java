public class Meal
{
    private String name;
    private String course;
    private int servings;
    
    public Meal(String fName, String crs, int count)
    {
        name = fName;
        course = crs;
        servings = count;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getCourse()
    {
        return course;
    }
    
    public int getServings()
    {
        return servings;
    }
    
    public String toString()
    {
        return getName() + " (" + getCourse() + ")";
    }
}