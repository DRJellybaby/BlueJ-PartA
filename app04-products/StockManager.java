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
        for (Product product : stockList)
        {
            if (product.getID() == id)
            {
                product.increaseQuantity(amount);
            }
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
        for (Product product : stockList)
        {
            if (product.getID() == id)
            {
                System.out.println(product.toString());
            }
        }
    }
    
    /**
     * 
     */
    public void sellProduct(int id, int quantitiy)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            product.sell(quantitiy);
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
    
    public void printHeading()
    {
        System.out.println("====================");
        System.out.println("W Deeley's Stock List");
        System.out.println("====================");
    }
}
