public class LastMultipleOfThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        int output = -1;
        for (int i : arr)
        {
            if (i % 3 == 0) output = i;
        }
        return output;
    }
}