
/**
 * Navkaran Singh 3119008
 */
/**
 * An interface for an associative map which binds a key uniquely to a value.
 * This interface is a simplified version of java.util.Map.
 */
public interface Map<K, V> {

    int size();

    boolean isEmpty();

    V get(K key);

    V put(K key, V value);

    V remove(K key);

    Iterable<K> keySet();

    Iterable<V> values();

    Iterable<Entry<K, V>> entrySet();
}
