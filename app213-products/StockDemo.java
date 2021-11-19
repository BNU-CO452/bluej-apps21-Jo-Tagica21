
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Air Force 1"));
        stock.add(new Product(102, "Air Max 95 Ultra"));
        stock.add(new Product(103, "Air Vapormax 2021"));
        stock.add(new Product(104, "Crater Impact"));
        stock.add(new Product(105, "Downsifter 9"));
        stock.add(new Product(106, "Metcon 7"));
        stock.add(new Product(107, "Mercurial Vapor Elite FG"));
        stock.add(new Product(108, "Quest 4"));
        stock.add(new Product(109, "React Vision"));
        stock.add(new Product(110, "Blazer Low X"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 1000);
        stock.buyProduct(102, 1000);
        stock.buyProduct(103, 1000);
        stock.buyProduct(104, 1000);
        stock.buyProduct(105, 1000);
        stock.buyProduct(106, 1000);
        stock.buyProduct(107, 1000);
        stock.buyProduct(108, 1000);
        stock.buyProduct(109, 1000);
        stock.buyProduct(110, 1000);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 549);
        stock.sellProduct(102, 23);
        stock.sellProduct(103, 169);
        stock.sellProduct(104, 2580);
        stock.sellProduct(105, 2);
        stock.sellProduct(106, 850);
        stock.sellProduct(107, 61);
        stock.sellProduct(108, 432);
        stock.sellProduct(109, 321);
        stock.sellProduct(110, 936);
        
        
    }    
}