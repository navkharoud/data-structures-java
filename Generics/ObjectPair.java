package Generics;
/**
 * Generic class: Classic
 * From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 */
public class ObjectPair {

    private Object first;
    private Object second;

    public ObjectPair(Object a, Object b) {
        first = a;
        second = b;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }
}
