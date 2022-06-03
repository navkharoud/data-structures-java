import java.util.Comparator;
/**
 * Navkaran Singh 3119008
 */

public class OrderByLatitude implements Comparator<PostalCode> {
     /**
     * compares and returns int value based on comparisons
     * @param PostalCode o1, PostalCode o2
     * @return int i
     */
     @Override
     public int compare(PostalCode o1, PostalCode o2) {
        double i=o2.getLongitude()-o1.getLongitude();
        if(i<0)
        return -1;
        else if(i>0)
            return 1;
        else
            return 0;
    }
    
}
