/**
 * Write a description of class Ticket here.
 *
 * Will Deeley
 * 13/10/2020
 */
public class Ticket
{
    private String destination;
    private int cost;

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
