/**
 * ACS-1904-003
 * Review 0319
 */

public class BakedGoods extends Product{   
    private static int lastID=1000;
    private String productID;
    
    public BakedGoods (String name, double price, int quantity){
        super(name, price, quantity);
        productID = Integer.toString(nextID());
    }
    
    private int nextID(){
        return ++lastID;
    }
    
    public String getID(){
        return productID;
    }
    
    public String toString(){
        return super.toString() + ", product ID: " + productID;
    }
}
