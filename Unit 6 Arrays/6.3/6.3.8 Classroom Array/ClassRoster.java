public class ClassRoster
{
    public static void main(String[] args)
    {
        Student julian = new Student("Julian", "Jones", 9);
        Student larisa = new Student("Larisa", "Torres", 10);
        Student amada = new Student("Amada", "Robin", 10);
        Student mikka = new Student("Mikka", "Leads", 9);
        Student jay = new Student("Jay", "Khalil", 10);
        
        Student[] classroom = {julian, larisa, amada, mikka, jay};

        // for each for printing goes here 
        for (Student kid : classroom)
        {
            System.out.print("Grade " + kid.getGradeLevel() + ": ");
            System.out.print(kid.getFirstName());
            System.out.println(" " + kid.getLastName());
        }
    }
}