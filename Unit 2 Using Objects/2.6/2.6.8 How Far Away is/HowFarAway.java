import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location: ");
        double lat1 = scanner.nextDouble();

        System.out.println("Enter the longitude of the starting location: ");
        double long1 = scanner.nextDouble();

        System.out.println("Enter the latitude of the ending location: ");
        double lat2 = scanner.nextDouble();

        System.out.println("Enter the longitude of the ending location: ");
        double long2 = scanner.nextDouble();

        GeoLocation loc1 = new GeoLocation(lat1,long1);
        GeoLocation loc2 = new GeoLocation(lat2,long2);

        double distance = loc1.distanceFrom(loc2);

        System.out.println("The distance is " + distance + " miles.");
    }
}