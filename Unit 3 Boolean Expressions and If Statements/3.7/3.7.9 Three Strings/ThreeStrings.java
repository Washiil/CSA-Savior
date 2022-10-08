import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        
        
        // Use comments to organize your logic before you start coding
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        
        System.out.println("Enter the comapny's secret code: ");
        String code = input.nextLine();
        
        String modelLogin = password + companyCode;
        String userLogin = password + code;
        
        System.out.println(modelLogin);
        System.out.println(userLogin);
        
        if (modelLogin.equals(userLogin))
        {
            System.out.println("Access granted");
        }
        else
        {
            System.out.println(password + code + " is denied");
        }
    }
}