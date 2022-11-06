public class Chef
{
    private String name;
    private String restaurantName;
    private Meal bestMeal;
    
    public Chef(String fName, String rName, Meal bMeal)
    {
        name = fName;
        restaurantName = rName;
        bestMeal = bMeal;
    }
    
    public String getRestaurant()
    {
        return restaurantName;
    }
    
    public String getMealName()
    {
        return bestMeal.getName();
    }
    
    public int getMealServings()
    {
        return bestMeal.getServings();
    }
    
    public String getMealCourse()
    {
        return bestMeal.getCourse();
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "Chef " + getName() + " works at " + getRestaurant() + " and is best known for " + bestMeal;
    }
}