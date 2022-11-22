public class Scores
{
    public static void main(String[] args)
    {
        int[] scores = { 80, 95, 82, 67, 100 };
        
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
        
        System.out.println();
        
        scores[2] = 73;
        scores[4] = 95;
        
        scores[2] = 72;
        scores[4] = 95;
        
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);
    }
}