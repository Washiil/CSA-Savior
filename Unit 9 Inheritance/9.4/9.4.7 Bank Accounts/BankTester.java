public class BankTester {
    public static void main(String[] args) {
        Account regularAccount = new Account(115, 52.3);
        StudentAccount studentAccount = new StudentAccount(445, 27.5);
        
        System.out.println(regularAccount.getBalance());

        regularAccount.deposit(10.0);
        regularAccount.withdraw(25.6);
        
        System.out.println(regularAccount.toString());
        System.out.println(regularAccount.getBalance());

        studentAccount.deposit(13.5);
        studentAccount.withdraw(7.45);

        System.out.println(studentAccount.toString());
        System.out.println(studentAccount.getBalance());
    }
}