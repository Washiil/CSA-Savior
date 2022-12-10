import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
 
 
 
    public void add(Musician artist)
    {
        if (top10.size() < 10 && artist.getIsPlatinum() == true)
        {
            top10.add(artist);
        }
        else if (artist.getIsPlatinum() == true)
        {
            replace(artist);
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " does not qualify for Top 10");
        }
    }
    
    public void replace(Musician artist)
    {
        Musician temp = top10.get(0);
        int index = 0;
        int lowest = temp.getWeeksInTop40();
        
        for(int i = 0; i < top10.size(); i++)
        {
            temp = top10.get(i);
            if(temp.getWeeksInTop40() < lowest)
            {
                lowest = temp.getWeeksInTop40();
                index = i;
            }
        }
        
        if(lowest < artist.getWeeksInTop40())
        {
            System.out.println("The musician " + top10.get(index).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(index, artist);
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}