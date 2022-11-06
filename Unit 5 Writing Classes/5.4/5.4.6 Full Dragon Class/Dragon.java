public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int lvl, String atk)
    {
        attack = atk;
        level = lvl;
    }
    
    // Put getters here
    
    public String getAttack()
    {
        return attack;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    // Put other methods here
    
    public String fight()
    {
        String output = "";
        for (int i = 0; i < level; i++)
        {
            output += attack;
        }
        return output;
    }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}