public class HealthyFood extends Food {
    private String group;
    private String color;

    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor) {
        super(foodName, calories);
        this.group = foodGroup;
        this.color = foodColor;
    }

    public String getGroup() {
        return this.group;
    }

    public String getColor() {
        return this.color;
    }
}