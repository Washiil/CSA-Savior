import java.util.Scanner;

public class RockPaperScissors

{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer)) {
            return TIE;
        }
        else if(user.equals("rock") && computer.equals("paper")) {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("paper") && computer.equals("rock")) {
            return USER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("rock")) {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("rock") && computer.equals("scissors")) {
            return USER_PLAYER;
        }
        else if(user.equals("paper") && computer.equals("scissors")) {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("paper")) {
            return USER_PLAYER;
        }
        return TIE;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true) {
            int computerChoice = Randomizer.nextInt(1, 3);
            String computer = "";
            if(computerChoice == 1) {
                computer = "paper";
            }
            else if(computerChoice == 2) {
                computer = "rock";
            }
            else {
                computer = "scissors";
            }

            System.out.println("Enter your choice (rock, paper, or scissors): ");

            String user = "";

            user = input.nextLine();

            if(!user.equals("paper") && !user.equals("rock") && !user.equals("scissors")) {
                break;
            }

            System.out.println("User: " + user);
            System.out.println("Computer: (either rock, paper, or scissors)");
            System.out.println(getWinner(user, computer));
        }
    System.out.println("Thanks for playing!");
    }
}