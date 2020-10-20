import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Class for creation of ticket and storage of related data
 * Tickets have a preset stop and price, that are set in the "TicketMachine" class
 *
 * Edited by Will Deeley
 * 18/10/2020
 */
public class Ticket
{
    // Ticket attributes, including stop (destination) price (cost) and the current date details
    private String destination;
    public int cost;
    private Date date;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int cost)
    {
        this.destination = destination;
        this.cost = cost;
        date = new Date();
    }
   
    /**
     * Global print method for tickets
     */
    public void print()
    {
        System.out.println("#############################");
        System.out.println("# the BlueJ line");
        System.out.println("# Ticket: " + destination);
        System.out.println("# Cost: " + cost);
        System.out.println("# Issued: " + date);
        System.out.println("#############################");
        System.out.println("===================================");
    }
}