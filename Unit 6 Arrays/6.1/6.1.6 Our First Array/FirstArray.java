public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        // String[] strArr = new String[3];
        String[] strArr = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] intArr = {667501, 2038822, 12330000};
        double[] dubArr = {8.11, 1.36, 6.05};
      // Print all 3 arrays according to the output in the description
        System.out.println(strArr[0] + "'s population is " + intArr[0] + ".");
        System.out.println(strArr[1] + "'s population is " + intArr[1] + ".");
        System.out.println(strArr[2] + "'s population is " + intArr[2] + ".");
        System.out.println();
        System.out.println("The least amount of sunshine " + strArr[0] + " gets is " + dubArr[0] + " hours a day.");
        System.out.println("The least amount of sunshine " + strArr[1] + " gets is " + dubArr[1] + " hours a day.");
        System.out.println("The least amount of sunshine " + strArr[2] + " gets is " + dubArr[2] + " hours a day.");
    }
}