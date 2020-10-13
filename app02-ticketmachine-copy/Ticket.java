
/**
 * Class to store and define ticket destination, cost and date
 *
 * @author Will Deeley
 * @version 11/10/2020
 */
public class Ticket
{
    // value of tickets to a stated location (Aylesbury, Amershamy, High Wycomb)
    private String destination;       
    private int ticketCost;

    /**
     * Entry for ticket details 
     */
    public Ticket(String destination, int ticketCost)
    {
        this.destination = destination;
        this.ticketCost = ticketCost;
    }
    
    public int ticketCost()
    {
        return ticketCost;        
    }
    
    public void print()
    {
        System.out.println("##################");
        System.out.println ("Destination: " + destination);
        System.out.println ("Cost: " + ticketCost);
        System.out.println(java.time.LocalDate.now());
        System.out.println("##################");
    }
}
