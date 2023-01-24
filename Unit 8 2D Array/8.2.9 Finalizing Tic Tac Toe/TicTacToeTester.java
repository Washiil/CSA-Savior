import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        Scanner input = new Scanner(System.in);
        
        int winner = 0;
        while (winner == 0)
        {
            game.printBoard();
            
            int row = -1;
            int col = -1;
            // pick and validate move
            while(true) 
            {
                System.out.println("Player " + game.getTurn() + " please make a move (1-9)");
                System.out.print("row > ");
                row = input.nextInt();
                System.out.print("col > ");
                col = input.nextInt();
                if(game.pickLocation(row, col) == true)
                {
                    break;
                }
            }
            game.takeTurn(row, col);
            
            if(game.checkWin() == true)
            {
                if(game.getTurn() % 2 == 0)
                {
                    winner = 0;
                }
                else
                {
                    winner = 1;
                }
                break;
            }
            System.out.println();
        }
        System.out.println("Player " + winner + " wins!!");
    }
}