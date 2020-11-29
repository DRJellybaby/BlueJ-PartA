/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * Allows testing of stock app without requireing exsesive user input
 * 
 * @author Will Deeley
 * @version 2020.11.07
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private int amount;

    /**
     * Create a StockManager and populate it with a few
     * sample products. for testing purposes only
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Samsung Galaxy S20 FE"));
        manager.addProduct(new Product(103,  "Apple iPhone 12"));
        manager.addProduct(new Product(104,  "Google Pixel 4A"));
        manager.addProduct(new Product(105, "Samsung Galaxy S7"));
        manager.addProduct(new Product(106,  "Apple iPhone 11"));
        manager.addProduct(new Product(107,  "Apple iPhone X"));
        manager.addProduct(new Product(108,  "Samsung Galaxy S9"));
        manager.addProduct(new Product(109,  "Samsung Galaxy S10"));
        manager.addProduct(new Product(110,  "Google Pixel 5"));
    }
}