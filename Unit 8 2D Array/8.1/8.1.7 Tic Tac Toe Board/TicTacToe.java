public class TicTacToe
{
    private String[][] board;
    
    public TicTacToe()
    {
        this.board = new String[][] {
            { "-", "-", "-" },
            { "-", "-", "-" },
            { "-", "-", "-" }
        };
    }
    
    public String[][] getBoard()
    {
        return board;
    }
}