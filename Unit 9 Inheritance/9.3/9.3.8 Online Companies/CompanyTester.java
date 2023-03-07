public class CompanyTester
{
    public static void main(String[] args)
    {
        Company cmp = new Company("Google", "1337 Foo rd", "Silicon Valley", "CA");
        System.out.println(cmp);
        
        OnlineCompany cmp1 = new OnlineCompany("Facebook", "datacollection.com");
        System.out.println(cmp1);
    }
}