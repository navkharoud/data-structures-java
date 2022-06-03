import java.io.Serializable;

/**
 * ACS-1904-003
 * Review 0319
 */

public abstract class Product implements Sellable, Serializable{
    protected String name;
    protected double price;
    protected int quantity;
        
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }  
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public abstract String getID();
    
    public String toString(){
        return name + " - price: $" +price+ ", quantity: " +quantity;
    }
    
    
}
