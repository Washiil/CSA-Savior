public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        
        Distance test = new Distance(100);
        
        System.out.println(100 + " km = " + test.toMiles() + " miles");
        System.out.println(100 + " km = " + test.toLeagues() + " leagues");
        System.out.println(100 + " km (one way) = " + test.doubleMiles() + " miles (round trip)");
        
        // Convert one to miles, one to leagues and
        // double one mileage
        
        // Print out the converted values
        // Use the getter!
    }
}