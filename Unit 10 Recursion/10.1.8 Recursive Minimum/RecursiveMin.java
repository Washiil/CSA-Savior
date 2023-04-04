import java.util.*;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while (true){
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             
             if (number == -1){
                 break;
             }
             else {
                 numbers.add(number);
             }
        }

        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }
    
    public static int findMinimum(ArrayList<Integer> arr) {
        // base case: when the ArrayList has only one element
        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            // get the minimum value from the rest of the ArrayList
            int minRest = findMinimum(new ArrayList<Integer>(arr.subList(0, arr.size()-1)));
            // compare the minimum value from the rest with the last element
            if (arr.get(arr.size()-1) < minRest) {
                return arr.get(arr.size()-1);
            } else {
                return minRest;
            }
        }
    }
}