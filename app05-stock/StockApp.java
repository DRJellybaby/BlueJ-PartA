
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
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
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
            listLowStock();
        }
        else if (choice.equals("RESTOCK"))
        {
            manager.restockLowStock();
        }
        else if (choice.equals("DELIVERY"))
        {
            takeDelivery();
        }
        else if (choice.equals("SELL"))
        {
            sellProduct();
        }
    }
    
    /** 
     * method to add products from the menu. Converts inputs appropriatly and adds to stock list.
     */
    private void addProduct()
    {
        System.out.println("\n Please enter Product Details:");
        //Entry for name of product. chacks if blank
        System.out.println("\n Product Name:");
        String name = input.getInput();
        if(name.isBlank())
        {
            System.out.println("Name cannot be blank");
            return;
        }
        //Entry for ID of product.
        System.out.println("\n Product ID:");
        String value = input.getInput();
        // converts ID to int, and checks for duplicate ID
        int id = Integer.parseInt(value);
        if (manager.chackDuplicateID(id))
        {
            System.out.println("ID already exsists");
        }
        else
        {
            Product product = new Product (id, name);
            manager.addProduct(product);
        }
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
    
    private void listLowStock()
    {
        System.out.println("\n Please enter minimum stock level:");
        String sLevel = input.getInput();
        int level = Integer.parseInt(sLevel);
        manager.listLowStock(level);
    }
    
    private void searchList()
    {
        System.out.println("\n Please enter Product Details:");
        System.out.println("\n Product Name:");
        String details = input.getInput();
        manager.printPartialName(details);
    }
    
    private void takeDelivery()
    {
        System.out.println("\n Please enter delivered product ID:");
        String ID = input.getInput();
        int id = Integer.parseInt(ID);
        
        System.out.println("\n Please enter amount delivered:");
        String Amount = input.getInput();
        int amount = Integer.parseInt(Amount);
        
        manager.delivery(id, amount);
    }
    
    private void sellProduct()
    {
        System.out.println("\n Please enter product ID:");
        String ID = input.getInput();
        int id = Integer.parseInt(ID);
        
        System.out.println("\n Please enter sale amount:");
        String Amount = input.getInput();
        int amount = Integer.parseInt(Amount);
        
        manager.sellProduct(id, amount);
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
        System.out.println("    LowStock:    list stock below the given level");
        System.out.println("    Restock:     Change the minimum stock level");
        System.out.println("    Delivery:    Increase the stock level of a product");
        System.out.println("    Sell:        Sell product from stock");
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
}
