public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Mike", 64000);
        HourlyEmployee e2 = new HourlyEmployee("Jane", 14.5, 40);
        System.out.println(e1);
        System.out.println(e2);
    }
}