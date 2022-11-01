public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        int x = 0;
        for (int i = 9; i > 0; i--)
        {
            for (int ij = x; ij > 0; ij--)
            {
                System.out.print(" ");
            }
            
            for (int j = i; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
            x++;
        }
        // Your code goes here!!!
    }
}
