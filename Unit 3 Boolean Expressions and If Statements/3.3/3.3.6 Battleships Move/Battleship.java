public class Battleship
{
    private String shipType;
    private int position;
    
    public Battleship(String type, int shipPosition)
    {
        shipType = type;
        position = shipPosition;
    }
    
    // Moves the ship
    // If safeToMove is true, add 10 to position
    // else subtract 1 from position
    public void move (boolean safeToMove)
    {
        if (safeToMove)
        {
            position = position + 10;
        }
        else 
        {
            position = position - 1;
        }
       // Because safeToMove is already a boolean
       // value, you DO NOT need to compare it to
       // true
       // Just use
       // if (safeToMove)

    }
    
    // Returns the position of the ship
    public int getPosition()
    {
        return position;
    }
    
    // String representation of the object
    public String toString()
    {
        return shipType + " at " + position;
    }
}