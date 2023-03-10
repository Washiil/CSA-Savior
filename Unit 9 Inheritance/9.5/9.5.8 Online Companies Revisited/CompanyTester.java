import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<Company>();
        
        while(true) 
        {
            System.out.print("Please enter a company name, enter 'exit' to quit: ");
            String company_name = input.nextLine();
            
            if(company_name.equals("exit")) break;
            
            System.out.print("Is this an online company, 'yes' or 'no': ");
            String online = input.nextLine();
            
            if(online.equals("yes")) 
            {
                System.out.print("Please enter the website address: ");
                String website = input.nextLine();
                OnlineCompany cmp = new OnlineCompany(company_name, website);
                companies.add(cmp);
            }
            else
            {
                System.out.print("Please enter the street address: ");
                String address = input.nextLine();
                
                System.out.print("Please enter the city: ");
                String city = input.nextLine();
                
                System.out.print("Please enter the state: ");
                String state = input.nextLine();
                
                Company cmp = new Company(company_name, address, city, state);
                companies.add(cmp);
            }
        }
        
        for(Company cmp : companies)
        {
            System.out.println(cmp);
        }
    }
}