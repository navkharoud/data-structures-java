import java.io.Serializable;
import java.util.ArrayList;

/**
 * ACS-1904-003
 * Review 0319
 */

public class Store implements Serializable{
    private String name;
    private ArrayList<Sellable> saleInventory;
    
    public Store(String name){
        this.name=name;
        saleInventory = new ArrayList<>();
    }
    
    public void addSaleItem(Sellable s){
        saleInventory.add(s);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder("Welcome to ");
        sb.append(name);
        sb.append(
        "!");
        sb.append("\nProducts:\n");
        for (Sellable s: saleInventory){
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
