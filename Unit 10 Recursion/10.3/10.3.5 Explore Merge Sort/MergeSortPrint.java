public class MergeSortPrint {

    public static void main(String[] args) {
        int[] myArray = {20, 9, 13, 34, 11, 22, 13, 10};
        System.out.print("Unsorted: ");
        for(int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Print unsorted array
        
        mergeSort(myArray, myArray.length);

        System.out.print("Sorted: ");
       
        // Print Sorted Array
       for(int i : myArray) {
           System.out.print(i + " ");
       }
        System.out.println();
    }

    public static void mergeSort(int[] current, int length) {
        if (length < 2) {
            return;
        }
        
        System.out.println("Splitting ...");
        
        int mid = length / 2;
        int[] left = new int[mid];

        int[] right = new int[length - mid];
        
        
        System.out.print("*** Left Half: ");
        
        // Create and print left array
        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
            System.out.print(left[i] + " ");
        }
        
        System.out.println();
        System.out.print("*** Right Half: ");
        
        // Create and print right array
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
            System.out.print(right[i - mid] + " ");
        }
        
        System.out.println();
        System.out.println();
        
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);
        
        System.out.print("*** Sorted so Far: ");
        // Print current array
        for(int i : current) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }

    public static void merge(int[] current, int[] left, int[] right)
    {
        System.out.println("Merging ... ");
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                current[k] = left[i];
                k++;
                i++;
            }
            else {
                current[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            current[k] = left[i];
                k++;
                i++;
        }
        while (j < rightSize) {
            current[k] = right[j];
                k++;
                j++;
        }
    }
}