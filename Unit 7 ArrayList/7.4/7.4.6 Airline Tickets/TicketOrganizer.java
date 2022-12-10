import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }
    
    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }

    public void printPassengersByBoardingGroup()
    {
        for(int i = 1; i < 6; i++)
        {
            System.out.println("Boarding Group " + i + ":");
            for(AirlineTicket ticket : tickets)
            {
                if(ticket.getBoardingGroup() == i)
                {
                    System.out.println(ticket.getName());
                }
            }
        }
    }
    
    public void canBoardTogether()
    {
        for(int i = 0; i < tickets.size() + 1; i++)
        {
            AirlineTicket person1 = tickets.get(i);
            AirlineTicket person2 = tickets.get(i + 1);
            if (person1.getRow() != person2.getRow()) 
            {
                System.out.println("There are no passengers with the same row and boarding group.");
                break;
            }
            else if (person1.getBoardingGroup() != person2.getBoardingGroup())
            {
                System.out.println("There are no passengers with the same row and boarding group.");
                break;
            }
            else
            {
                System.out.println(person1.getName() + " can board with " + person2.getName());
            }
        }
    }
}