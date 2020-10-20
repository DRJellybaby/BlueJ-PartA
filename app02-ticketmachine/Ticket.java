import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Class for creation of ticket and storage of related data
 *
 * Edited by Will Deeley
 * 18/10/2020
 */
public class Ticket
{
    // Ticket attributes, including stop (destination) price (cost) and the current date details
    public String destination;
    public int cost;
    // private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
    private Date date;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int cost)
    {
        // initialise instance variables
        this.destination = destination;
        this.cost = cost;
        date = new Date();
    }
   
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