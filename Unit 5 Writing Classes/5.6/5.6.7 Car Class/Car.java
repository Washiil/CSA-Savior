public class Car {
    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity) {
        this.tankCapacity = carTankCapacity;
        this.efficiency = carEfficiency;
    }
    
    public void addGas() {
        this.gas = this.tankCapacity;
        System.out.println("Filling up ...");
    }
    
    public void addGas(double amount) {
        this.gas += amount;
        if (gas > this.tankCapacity) {
            this.gas = this.tankCapacity;
        }
        System.out.println("Adding gas ...");
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if (this.gas * this.efficiency >= distance) {
            this.gas -= (distance / efficiency);
            this.totalMilesDriven += distance;
            System.out.println("Driving " + distance);
        }
        else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive(double distance) {
        if (this.gas * this.efficiency >= distance) {
            return true;
        }
        return false;
    }
    
    public double milesAvailable() {
        return this.gas * this.efficiency;
    }
    
    public double getGas() {
        return gas;
    }
}