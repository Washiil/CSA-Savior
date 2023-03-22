import java.util.*;

public class CarTester
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<Car>();
        
        Scanner input = new Scanner(System.in);
        boolean first = true;
        while(true) {
            if(!first) {
                input.nextLine();
            }
            System.out.println("Enter your cars' information: ");
            System.out.print("Model (exit to quit): ");
            String model = input.nextLine();
            
            if(model.equals("exit")) break;
            
            System.out.print("Electric car (y/n): ");
            String electric = input.nextLine();
            
            if(electric.equals("y")) {
                System.out.print("Percent of battery left (as a whole number): ");
                int fuel = input.nextInt();
                cars.add(new ElectricCar(model, fuel));
            }
            else {
                System.out.print("Gallons of fuel left: ");
                int fuel = input.nextInt();
                cars.add(new Car(model, fuel));
            }
            first = false;
        }
        
        System.out.println();
        
        for(Car car : cars) {
            System.out.println(car);
            System.out.println("Fuel Amount: " + car.getFuelLevel() + "\n");
        }
    }
}