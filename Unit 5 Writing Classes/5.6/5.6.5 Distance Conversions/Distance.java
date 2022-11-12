public class Distance
{
    private double kilometers;
    
    public Distance(double km) {
        kilometers = km;
    }
    
    public double toMiles() {
        return kilometers / 1.609;
    }
    
    public double toLeagues() {
        return kilometers / 5.556;
    }
    
    public double doubleMiles() {
        return this.toMiles() * 2;
    }
    
    public double getKilometers() {
        return kilometers;
    }
}