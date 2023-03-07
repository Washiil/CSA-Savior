public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car car = new Car("Mustang", 100);
        
        // Print out the model
        System.out.println(car.getModel());
        
        // Print out the fuelLevel
        System.out.println(car.getFuelLevel());
        
        // Print how many miles are left with 23 mpg
        System.out.println(car.milesLeft(23));
        
        // Print the object
        System.out.println(car);
        
        // Create an ElectricCar object
        ElectricCar car2 = new ElectricCar("Tesla", 100);
        
        // Print out the model
        System.out.println(car2.getModel());
        
        // Print out the fuelLevel
        System.out.println(car2.getFuelLevel());
        
        // Print how many miles are left with 400 miles per charge
        System.out.println(car2.milesLeft(400));
        
        // Print the object
        System.out.println(car2);
    }
}