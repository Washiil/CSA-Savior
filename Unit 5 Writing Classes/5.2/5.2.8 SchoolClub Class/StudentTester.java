public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        System.out.println(alan);
        System.out.println(ada);
        
        SchoolClub club1 = new SchoolClub(alan, "CSA Club");
        
        System.out.println(club1);
        
    }
}