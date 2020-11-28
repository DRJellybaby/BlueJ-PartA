
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;
    private StockManager manager;
    private StockDemo demo;
    private int lowStockLevel;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
        lowStockLevel = 10;
    }

    /**
     * 
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
   
    
    private void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printMenuChoices();
            
            String choice = input.getInput();
            choice = choice.toUpperCase();
            if(choice.equals("QUIT"))
            {
                finished = true;
            }
            else
            {
                menuChoice(choice);
            }
        }
    }
    
    private void menuChoice(String choice)
    {
        if (choice.equals("ADD"))
        {
           addProduct();
        }
        else if (choice.equals("REMOVE"))
        {
           removeProduct();
        }
        else if (choice.equals("PRINTALL"))
        {
            manager.printAll();
        }
        else if (choice.equals("SEARCH"))
        {
           searchList();
        }
        else if (choice.equals("LOWSTOCK"))
        {
            manager.listLowStock();
        }
        else if (choice.equals("RESTOCK"))
        {
            manager.listLowStock();
        }
    }
    
    /** 
     * method to add products from the menu. Converts inputs appropriatly and adds to stock list.
     */
    private void addProduct()
    {
        System.out.println("\n Please enter Product Details:");
        System.out.println("\n Product Name:");
        String name = input.getInput();
        
        System.out.println("\n Product ID:");
        String value = input.getInput();
        
        int id = Integer.parseInt(value);
        Product product = new Product (id, name);
        
        manager.addProduct(product);
    }
    
    /** 
     * 
     */
    private void removeProduct()
    {
        System.out.println("\n Please enter Product ID you wish to remove:");
        String ID = input.getInput();
        
        int id = Integer.parseInt(ID);
        manager.removeProduct(id);
    }
    
    private void searchList()
    {
        System.out.println("\n Please enter Product Details:");
        System.out.println("\n Product Name:");
        String details = input.getInput();
        manager.printPartialName(details);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:         Add a new product");
        System.out.println("    Remove:      Remove an old product");
        System.out.println("    PrintAll:    Print all products");
        System.out.println("    Search:      Search product list for products");
        System.out.println("    LowStock:    list stock below the minimum level (" + lowStockLevel + ")");
        System.out.println("    RESTOCK:     Change the minimum stock level");
        System.out.println("    Quit:        Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("==============================");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Will Deeley     ");
        System.out.println("==============================");
    }
    
    private void returnToMain()
    {
        System.out.println("==============================");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Will Deeley     ");
        System.out.println("==============================");
    }
}
