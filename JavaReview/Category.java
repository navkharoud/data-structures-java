import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;
    
    public Category() {
        this("unknown");
    }
    
    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public String toString() {
        String s = "Category: " + name +"\n";
        for (Product p : products){
            s += p + "\n";
        }
        return s;
    }
}
