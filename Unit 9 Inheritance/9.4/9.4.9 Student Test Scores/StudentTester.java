import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        // Prompt the user for name, test scores, and service hours
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the student name: ");
        String name = input.nextLine();
        
        System.out.println("Please enter the Math Score:");
        int math_score = input.nextInt();
        
        System.out.println("Please enter the ELA Score: ");
        int ela_score = input.nextInt();
        
        System.out.println("Please enter the Service Hours: ");
        int service_hours = input.nextInt();
        
        // Create a HSStudent object
        HSStudent student = new HSStudent(name, math_score, ela_score, service_hours);
        
        // Print the results
        
        System.out.println("Pass Math? " + student.passMath());
        System.out.println("Pass ELA? " + student.passEla());
        System.out.println("Completed Service Hours? " + student.completeService());
        System.out.println(student);
    }
}