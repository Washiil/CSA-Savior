import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> availablePlayers = new ArrayList<String>();
        ArrayList<String> finalRoster = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        while(finalRoster.size() < 5)
        {
            System.out.println("Enter name of player to add: ");
            String player = input.nextLine();
            int index = search(availablePlayers, player);
            if(index != -1)
            {
                availablePlayers.remove(index);
                finalRoster.add(player);
                System.out.println("Successfully added player\n");
            }
            else
            {
                System.out.println(player + " is not an available player.");
            }
        }
        
        System.out.println("Final Team Roster: ");
        for(String ele : finalRoster)
        {
            System.out.println(ele);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i).equals(player)) return i;
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}
