/**
 * Generic Pair class
 * From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 */
package Generics;

public class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A a, B b) {                  // constructor
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public String toString() {
        return "[" + first + ", " + second + "]";
    }
}
