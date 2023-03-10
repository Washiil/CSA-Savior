public class Assignment
{
    private String name;
    private String dueDate;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints) {
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDueDate() {
        return dueDate;
    }
    
    public double getAvailablePoints() {
        return availablePoints;
    }
    
    public double getEarnedPoints() {
        return earnedPoints;
    }
}