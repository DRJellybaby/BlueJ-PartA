import java.util.Date;
/**
 * This class details, creates and stores all relivent info for stops along a route
 *
 * Will Deeley
 * 13/10/2020
 */
public class Ticket
{
    //tickets indended endpoint
    private String destination;
    //a tickets intended cost
    private int cost;
    //current date at time of printing
    private Date currentDate = new Date();

    /**
     * Constructor for objects of class ticket
     */
    public Ticket(String destination, int cost)
    {
        this.destination = destination;
        this.cost = cost;
    }

    public void printTicket()
    {
            System.out.println("##################");
            System.out.println("# The " + destination + " Line");
            System.out.println("# Ticket");
            System.out.println("# " + cost + " cents.");
            System.out.println(java.time.LocalDate.now());
            System.out.println("##################");
            System.out.println();
    }
}
