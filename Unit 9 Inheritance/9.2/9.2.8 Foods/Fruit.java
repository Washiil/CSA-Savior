public class Fruit extends HealthyFood {
    private boolean inSeason;
    private String vitamins;

    public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins) {
        super(foodName, calories, "Fruit", foodColor);
        this.inSeason = isInSeason;
        this.vitamins = majorVitamins;
    }

    public boolean isInSeason() {
        return this.inSeason;
    }

    public String getVitamins() {
        return this.vitamins;
    }
}