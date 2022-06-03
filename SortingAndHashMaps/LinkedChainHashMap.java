
import java.util.*;

/**
 * Navkaran Singh 3119008
 */
public class LinkedChainHashMap<K, V> extends AbstractHashMap<K, V> {

    private LinkedList<MapEntry<K, V>>[] table;

    public LinkedChainHashMap(int cap, int p) {
        super(cap, p);
    }

    public LinkedChainHashMap(int cap) {
        super(cap);
    }

    public LinkedChainHashMap() {
        super();
    }

    protected void createTable() {
        table = (LinkedList<MapEntry<K, V>>[]) new LinkedList[capacity];
    }

    protected V bucketGet(int h, K k) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        if (bucket == null) {
            return null;
        }
        for (MapEntry<K, V> e : bucket) {
            if (e.getKey().equals(k)) {
                return e.getValue();
            }
        }
        return null;
    }

    protected V bucketPut(int h, K k, V v) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        MapEntry<K, V> answer = new MapEntry<>(k, v);
        if (bucket == null) {
            bucket = table[h] = new LinkedList<>();

        }
        int oldSize = bucket.size();
        bucket.add(oldSize, answer);
        n += (bucket.size() - oldSize); 
        return answer.getValue();
    }

    protected V bucketRemove(int h, K k) {
        LinkedList<MapEntry<K, V>> bucket = table[h];
        if (bucket == null) {
            return null;
        }
        int oldSize = bucket.size();
        V answer = null;
        for (int i = 0; i <= oldSize; i++) {
            if (bucket.get(i).getKey().equals(k)) {
                answer = bucket.get(i).getValue();
                bucket.remove(i);
                break;
            }
        }

        n -= (oldSize - bucket.size()); 
        return answer;
    }

    public Iterable<Entry<K, V>> entrySet() {
        LinkedList<Entry<K, V>> buffer = new LinkedList<>();
        for (int h = 0; h < capacity; h++) {
            if (table[h] != null) {
                for (Entry<K, V> entry : table[h]) {
                    int i = 0;
                    buffer.add(i, entry);
                    i++;
                }
            }
        }

        return buffer;

    }

    public int getCollisions() {
        int collisions = 0;
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                collisions += (table[i].size() - 1);
            }
        }
        return collisions;
    }
}
