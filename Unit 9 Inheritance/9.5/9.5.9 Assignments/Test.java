public class Test extends Assignment {
    private String testType;
    public Test(String name, String dueDate, double availablePoints, double earnedPoints, String testType) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.testType = testType;
    }
    
    public String getTestType() {
        return this.testType;
    }
    
    public void setTestType(String type) {
        this.testType = type;
    }
}