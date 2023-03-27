import java.util.*;

public class AssignmentRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        ArrayList assigns = new ArrayList<Assignment>();
        
        while(true){
            System.out.print("Enter the assignment's name (exit to quit): ");
            String name = input.nextLine();
            
            if(name.equals("exit")) break;
            
            System.out.print("Enter the due date: ");
            String date = input.nextLine();
            
            System.out.print("How many points is the assignment worth? ");
            double total_points = input.nextDouble();
            
            System.out.print("How many points were earned? ");
            double earned_points = input.nextDouble();
            
            input.nextLine();
            
            System.out.print("Is this a (T)est or a (P)roject? ");
            String assignment_type = input.nextLine();
            
            if(assignment_type.equals("T")){
                System.out.print("What type of test is it? ");
                String test_type = input.nextLine();
                
                Test tes = new Test(name, date, total_points, earned_points, test_type);
                assigns.add(tes);
            }
            else if(assignment_type.equals("P")){
                System.out.println("Does this project require (true/false) ...");
                
                System.out.print("Groups? ");
                boolean groups = input.nextBoolean();
                
                System.out.print("A presentation? ");
                boolean presentation = input.nextBoolean();
                
                input.nextLine();
                Project proj = new Project(name,date,total_points,earned_points,groups,presentation);
                assigns.add(proj);
            }
        }
        printSummary(assigns);
    }

    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
       for(int i = 0; i < assignments.size(); i++){
            double percent = (assignments.get(i).getEarnedPoints()/assignments.get(i).getAvailablePoints())*100; 
            System.out.println(assignments.get(i).getName() + " - " + percent);
        }
       
    }
}
