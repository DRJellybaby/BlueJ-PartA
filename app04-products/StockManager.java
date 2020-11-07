import java.util.ArrayList;
import java.lang.System;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stockList;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stockList = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stockList.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.increaseQuantity(amount);
        }
        else
        {
            printInvalidId(id);
        }
    }

    /**
     * 
     */
    public void changeProductName(int id, String name)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.setName(name);
        }
        else
        {
            printInvalidId(id);
        }
    }    

    /**
     * remove specific product from the stock list based on the ID
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            stockList.remove(1);
        }
        else
        {
            printInvalidId(id);
        }
    }    

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product product : stockList)
        {
            if (product.getID() == id)
            {
                return product;
            }
            else
            {
                printInvalidId(id);
            }
        }
        return null;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            System.out.println(product.toString());
        }
    }

    public void listLowStock()
    {
        printLowStockHeading();
        for (Product product : stockList)
        {
            if (product.getQuantity() <= 10)
            {
                System.out.println(product.toString());
            }
        }
    }

    /**
     * sell a custom amount of a product
     */
    public void sellProduct(int id, int quantitiy)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.sell(quantitiy);
        }
        else
        {
            printInvalidId(id);
        }
    }

    /**
     * Print details of all the products.
     */
    public void printAll()
    {
        printHeading();
        for (Product product : stockList)
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print Method for heading of list methods
     */
    public void printHeading()
    {
        System.out.println("====================");
        System.out.println("W Deeley's Stock List");
        System.out.println("====================");
    }
    
    /**
     * Print Method for Low stock method
     */
    public void printLowStockHeading()
    {
        System.out.println("====================");
        System.out.println("W Deeley's Stock List");
        System.out.println("Low Stock (under 10)");
        System.out.println("====================");
    }
    
    /**
     * Print Method for when a search is invalid based on the ID
     */
    public void printInvalidId(int id)
    {
        System.out.println("====================");
        System.out.println("No item with ID: " + id + " exsists");
        System.out.println("====================");
    }

}
