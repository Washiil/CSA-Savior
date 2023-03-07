public class Food {
    private String name;
    private int calories;

    public Food(String foodName, int calories) {
        this.name = foodName;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return this.name + " has " + this.calories + " calories";
    }
}