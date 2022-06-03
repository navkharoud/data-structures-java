import java.util.Comparator;

/**
 * Navkaran Singh 
 */
public class OrderByFrequency implements Comparator<Entry<String,Integer>>{

    @Override
    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
      return o2.getValue()-o1.getValue();
    }

  
  
    
}
