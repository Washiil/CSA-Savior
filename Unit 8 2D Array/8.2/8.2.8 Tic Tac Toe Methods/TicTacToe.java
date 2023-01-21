public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board;
    
    public TicTacToe()
    {
        this.board = new String[][] {
            { "-", "-", "-" },
            { "-", "-", "-" },
            { "-", "-", "-" }
        };
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return this.turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for (int i = 0; i < 3; i++)
       {
           System.out.print(i + " ");
           for (int j = 0; j < 3; j++) 
           {
               System.out.print(board[i][j] + " ");
           }
           System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       if(board[row][col].equals("-"))
       {
           return true;
       }
       return false;
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(!pickLocation(row, col)) return;
       if(turn % 2 == 0)
       {
           this.board[row][col] = "X";
       }
       else
       {
           this.board[row][col] = "O";
       }
       this.turn++;
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       for(String[] row : this.board)
       {
           if(row[0].equals(row[1]) && row[1].equals(row[2]) && !row[0].equals("-"))
           {
               return true;
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       for (int i = 0; i < board.length; i++)
       {
           if(board[0][i].equals("O") || board[0][i].equals("X"))
           {
               if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
               {
                   return true;
               }
           }
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
        if(board[0][0].equals("O") || board[0][0].equals("X"))
        {
            if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            {
                return true;
            }
            if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
            {
                return true;
            }
        }
        return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       if(checkRow() || checkCol() || checkDiag())
       {
           return true;
       }
       return false;
   }
}