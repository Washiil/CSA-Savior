import java.util.Scanner;
import java.util.ArrayList;

public class AssignmentRunner {

    public static void main(String[] args) {
        // SEE THIS FOR ERROR
        Scanner strInput = new Scanner(System.in);
        Scanner dubInput = new Scanner(System.in);
        Scanner boolInput = new Scanner(System.in);
        
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        
        while(true) {
            System.out.print("Enter the assignment's name (exit to quit): ");
            String name = strInput.nextLine();
            
            if(name.equals("exit")) break;
            
            System.out.print("Enter the due date: ");
            String dueDate = strInput.nextLine();
            
            System.out.print("How many points is the assignment worth? ");
            double totalPoints = dubInput.nextInt();
            
            
            System.out.print("How many points were earned? ");
            double pointsEarned = dubInput.nextDouble();
            
            System.out.print("Is this a (T)est or a (P)roject? ");
            String type = strInput.nextLine();
            
            if(type.equals("T")) {
                System.out.print("What type of test is it? ");
                String testType = strInput.nextLine();
                Test assignment = new Test(name, dueDate, totalPoints, pointsEarned, type);
                
                assignments.add(assignment);
            }else if(type.equals("P")) {
                System.out.println("Does this project require (true/false) ...");
                System.out.print("Groups? ");
                boolean groups = boolInput.nextBoolean();
                
                System.out.print("A presentation? ");
                boolean presentation = boolInput.nextBoolean();
                Project assignment = new Project(name, dueDate, totalPoints, pointsEarned, groups, presentation);
                
                assignments.add(assignment);
            }
        }
        
        for(Assignment test : assignments) {
            System.out.println(test);
        }
    }

    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
       
       
    }
}