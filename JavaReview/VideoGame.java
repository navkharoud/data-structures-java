/**
 * ACS-1904-003
 * Review 0319
 */
	
public class VideoGame extends Product{
    private String genre;
    private String upc;
    
    public VideoGame(String name, String upc, double price, int quantity, String genre){
        super(name, price, quantity);
        this.upc = upc;
        this.genre = genre;
    }
    
    public String getID(){
        return upc;
    }
    
    public String toString(){
        return super.toString() + ", UPC: " + upc + " " ;
    }
    
}
