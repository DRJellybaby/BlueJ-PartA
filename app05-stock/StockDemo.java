/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * 
 * Added demo for added features:
 * Print all products
 * Take delivery of products
 * Sell Products
 * Rename products based on the product ID
 * remove products from the stock list
 * Search for a product with only some of the information
 * list stock with low quantity
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
     * sample products.
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
    
    /**
     * Demo method to test receiveing a delivey of stock.
     */
    public void demoDelivery()
    {
        amount = 10;
        for (int id = 101; id<= 110; id++)
        {
            amount++;
            manager.delivery(id, amount);
        }
    }
    
    /**
     * Demo method to test renaming of a product.
     */
    public void demoRenameProduct()
    {
        manager.changeProductName(105, "Samsung Galaxy S8");
        manager.printAll();
    }
    
    /**
     * Demo method to test removing a specific product from a list.
     */
    public void demoRemoveProduct()
    {
        manager.removeProduct(102);
        manager.printAll();
    }
        
    /**
     * Demo method to test locating a specific product basedon a part of the name.
     * (All products with Samsung in their name in this case).
     */
    public void demoPrintPartialName()
    {
        manager.printPartialName("Samsung");
    }
    
    /**
     * Demo method to test locating a specific product basedon a part of the name.
     * (106 in this case).
     */
    public void demoNumberInStock()
    {
        manager.numberInStock(106);
    }
    
    /**
     * Demo method to test listing all products with a quantity under 10.
     */
    public void demoListLowStock()
    {
        manager.listLowStock(10);
    }
    
    /**
     * Demo method to test selling products based on the ID.
     */
    public void demoSellProduct()
    {
        for (int id = 101; id<= 111; id++)
        {
        manager.sellProduct(id, 5);
        }
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
    
}
