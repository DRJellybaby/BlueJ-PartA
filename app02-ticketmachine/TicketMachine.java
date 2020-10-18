/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Edited by Will Deeley
 * 18/10/2020
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    //Variables for pre set destinations
    private Ticket destination;
    private Ticket cost;
    private Ticket date;
    private Ticket ticket;
    
    private Ticket issuedTicket;
    private Ticket readingTicket;
    private Ticket maidenheadTicket;
    private Ticket sloughTicket;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        //pre defined tickets
        readingTicket = new Ticket("Reading", 170);
        maidenheadTicket = new Ticket("Maidenhead", 220);
        sloughTicket = new Ticket("Slough", 270);
    }
    
    /**
     * Select a ticket from the predefined list
     */
    public void destination(String stop)
    {
          if (stop == "Maidehead")
          {
              issuedTicket = maidenheadTicket;
              price = maidenheadTicket.cost;
          }
          else if (stop == "Slough")
          {
              issuedTicket = sloughTicket;
          }
          else if (stop == "Reading")
          {
              issuedTicket = readingTicket;
          }
          else
          {
              System.out.println("Please enter a valid Destination:");
              System.out.println("Reading");
              System.out.println("Maidenhead");
              System.out.println("Slough");
          }
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    /**
     * Check that the amount is sensible.
     */
    public void printSelectedTicket()
    {
        if(balance >= price) 
        {
            issuedTicket.print();
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /** print all Avalible Tickets
     */ 
    public void printAllTickets()
    {
       System.out.println("The following tickets are avalible:");
       maidenheadTicket.print();
       System.out.println("===================================");
       readingTicket.print();
       System.out.println("===================================");
       sloughTicket.print();
    }
        
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
