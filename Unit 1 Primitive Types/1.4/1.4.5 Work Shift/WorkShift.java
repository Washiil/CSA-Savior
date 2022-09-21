public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;
        
        int total = 0;
        
        total += hours * 60 * 60;
        total += minutes * 60;
        total+= seconds;
        
        System.out.println("Total seconds: " + total);
    }
}