
import java.util.*;

/**
 * Navkaran Singh 3119008
 */
public class ProbeHashMap<K, V> extends AbstractHashMap<K, V> {

    private MapEntry<K, V>[] table;
    private MapEntry<K, V> DEFUNCT = new MapEntry(null, null);
    private int collisions=0;
   
    public ProbeHashMap(int cap, int p) {
        super(cap, p);
    }

    public ProbeHashMap(int cap) {
        super(cap);
    }

    public ProbeHashMap() {
        super();
    }

    protected void createTable() {
        table = (MapEntry<K, V>[]) new MapEntry[capacity];
    }

    // tells location is empty or occupied by defunct entry
    private boolean isAvailable(int j) {
        return (table[j] == null || table[j] == DEFUNCT);
    }

    private int findSlot(int h, K k) {
        int avail = -1;
        int j = h;
        do {
            // check empty or defucnt position
            if (isAvailable(j)) {
                if (avail == -1) {
                    avail = j;
                 
                }
                // exist if empty
                if (table[j] == null) {
                    break;
                }
            } //successful match
            else if (table[j].getKey().equals(k)) {
                return j;
            }
            // cycling thru the array
            j = (j + 1) % capacity;
            collisions++;
            
        } while (j != h); // stop is starting index is encountered
        return -(avail + 1); // return this, if search has failed
    }

    protected V bucketGet(int h, K k) {
        int j = findSlot(h, k);
        if (j < 0) {
            return null;
        }
        return table[j].getValue();
    }

    protected V bucketRemove(int h, K k) {
        int j = findSlot(h, k);
        if (j < 0) {
            return null;
        }
        V answer = table[j].getValue();
        table[j] = DEFUNCT;
        n--;
        return answer;
    }

    protected V bucketPut(int h, K k, V v) {
        int j = findSlot(h,k);
        if(j>=0){
         return table[j].setValue(v);
         
        }
        table[-(j+1)] = new MapEntry<>(k,v);
        n++;
        return null;
    }

    public Iterable<Entry<K, V>> entrySet() {
        ArrayList<Entry<K, V>> buffer = new ArrayList<>();
        for (int h = 0; h < capacity; h++) {
            if (!isAvailable(h)) {
                buffer.add(table[h]);
            }
        }
        return buffer;
    }
    
    public int getCollisions(){
       
         return collisions;
    }
}
