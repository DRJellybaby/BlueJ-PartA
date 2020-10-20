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
 * Added support for inserting spacific coins 
 * Established preset destinations and the ability to print all avalible tickets
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    //pre-set destinations
    private Ticket issuedTicket;
    private Ticket readingTicket;
    private Ticket maidenheadTicket;
    private Ticket sloughTicket;
    
    private Coin coin;

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
    public void selectDestination(String stop)
    {
          if (stop == "Maidenhead" || stop == "maidenhead")
          {
              issuedTicket = maidenheadTicket;
              price = maidenheadTicket.cost;
              System.out.println("Maidenhead Selected");
          }
          else if (stop == "Slough"|| stop == "slough")
          {
              issuedTicket = sloughTicket;
              price = sloughTicket.cost;
              System.out.println("Slough Selected");
          }
          else if (stop == "Reading" || stop == "reading")
          {
              issuedTicket = readingTicket;
              price = readingTicket.cost;
              System.out.println("Reading Selected");
          }
          else
          {
              System.out.println("Please select a valid Destination:");
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
        if(amount > 0 )
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }
    
    
    /**
     * Methods for inserting defined coins and displaying current total balance
     */
    public void insert10p()
    {
        printBalance(10);
    }
    public void insert20p()
    {
        printBalance(20);
    }
    public void insert£1()
    {
        printBalance(100);
    }
    public void insert£2()
    {
        printBalance(200);
    }
    public void printBalance(int amount)
    {
        balance = balance + amount;
        System.out.println("you have inserted " + amount );
        System.out.println("current balance = " + balance );
    }
    
    
    /**
     * Check that the correct amount of money has been entered, and that a ticket has been selected.
     * if correct, the ticket will be printed
     */
    public void printSelectedTicket()
    {
        if(balance >= price) 
        {
            issuedTicket.print();
            balance = balance - issuedTicket.cost;
        }
        else if (issuedTicket == null)
        {
            selectDestination(null);
        }
        else
        {
            System.out.println("please enter more money");
            System.out.println("Currently missing: " + (price - balance));
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

    /** print all Avalible Predefined Tickets
     */ 
    public void printAllTickets()
    {
       System.out.println("The following tickets are avalible:");
       maidenheadTicket.print();
       readingTicket.print();
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
