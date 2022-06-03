import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ACS-1904-003
 * Review 0319
 */

public class Program8{
    public static void main(String[] args) throws IOException{
        Store store = new Store("OurStore");
        BakedGoods cookies = new BakedGoods("Cookie", 1.99, 59);
        VideoGame game = new VideoGame("Pokemon Shield", "4549659663", 79.99, 2, "RPG");
        store.addSaleItem(cookies);
        store.addSaleItem(game); 
        
        System.out.println(store);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("P8.ser"));
        os.writeObject(store);
        os.close();
        System.out.println("*** Data written to P8.ser ***");          
    }
}
