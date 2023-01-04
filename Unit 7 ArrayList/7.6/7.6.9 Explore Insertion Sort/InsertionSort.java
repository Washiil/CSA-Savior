import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static void insertionSort(int[] array) {
    // Loop through the array, starting at the second element (index 1)
        for (int i = 1; i < array.length; i++) {
            // Save the value of the element at the current index
            int current = array[i];
            // Initialize a variable to store the index of the previous element
            int j = i - 1;
            // Loop backwards through the array, as long as the previous element is greater than the current element
            while (j >= 0 && array[j] < current) {
                // Shift the element at the previous index one position to the right
                array[j + 1] = array[j];
                // Move to the next previous element
                j--;
            }
            // Insert the current element into its correct position
            array[j + 1] = current;
        }
    }
}