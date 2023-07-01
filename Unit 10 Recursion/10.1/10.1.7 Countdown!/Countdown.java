import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int num = input.nextInt();
        String output = countdown(num);
        System.out.println(output);
    }
    
    public static String countdown(int number)
    {
       // Base case - return Blastoff!
       if(number == 0) {
           return "Blastoff!";
       }
       else {
           if(number % 2 == 0) {
               return number + " " + countdown(number - 2);
           }
           else {
               return  number + " " + countdown(number - 1);
           }
       }
    }
}