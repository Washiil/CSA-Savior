import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the Person's name: ");
        String p1_name = input.nextLine();
        System.out.print("Please enter the Person's birthday: ");
        String p1_birth = input.nextLine();
        
        Person p1 = new Person(p1_name, p1_birth);
        
        System.out.print("Please enter the Student's name: ");
        String p2_name = input.nextLine();
        System.out.print("Please enter the Student's birthday: ");
        String p2_birth = input.nextLine();
        System.out.print("Please enter the Student's grade: ");
        int p2_grade = input.nextInt();
        
        Student p2 = new Student(p2_name, p2_birth, p2_grade);
        
        System.out.print("Same: " + p2.equals(p1));
    }
}