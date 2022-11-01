public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
    
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        // Your code goes here!!!
        // i = Amount of rows
        for (int i = 1; i <= 10; i++) {
            // j = amount of coloumns
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}
