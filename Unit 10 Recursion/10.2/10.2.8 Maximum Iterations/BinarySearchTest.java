import java.util.*;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {
        
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        printData(generateArrayOfLength(100));
        printData(generateArrayOfLength(1000));
        printData(generateArrayOfLength(10000));
        printData(generateArrayOfLength(100000));
    }
    
    public static void printData(int[] array) {
        System.out.println("Array Size: " + array.length);
        System.out.println("Max iterations: " + binaryMax(array.length));
        System.out.println("Actual iterations: " + binaryRec(array, array[4], 0, array.length));
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
            count ++;
        	// Base Case
        	if (target == array[mid]) {
        			return mid;
        	}
    
            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}