import java.util.ArrayList;

public class MergeSortCounter {

    private static int numCalls;

    public static void main(String[] args) {
        int[] array;
        // Fancy logic that allows easy scaling
        for (int i = 2; i <= 5; i++) {
            array = makeRandomArray((int) Math.pow(10, i));
            numCalls = 0;
            mergeSort(array, array.length);
            System.out.println("Number of calls with " + array.length + " elements: " + numCalls);
        }
    }

    public static void mergeSort(int[] current, int length) {
        numCalls++; // incrementing the counter
        
        if (length < 2) {
            return;
        }
        
        // numCalls++; // incrementing the counter
        
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }

        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);

    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k++] = left[i++];
            }
            else {
                current[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }
    }

    public static int[] makeRandomArray(int number){
        int[] array = new int[number];
        ArrayList<Integer> sorted = new ArrayList<Integer>(number);
        // Create the sorted list
        for (int i = 0; i < number; i++){
            sorted.add(i);
        }

        // Now shuffle it.
        int index = 0;
        while (sorted.size() > 0){
            int randomIndex = (int)(Math.random()*sorted.size());
            array[index] = sorted.remove(randomIndex);
            index ++;
        }

        return array;
    }
}