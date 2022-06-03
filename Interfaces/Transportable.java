package Interfaces;

/**
 * Interfaces Demo
 * From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 */

/**
 * Interface for objects that can be transported.
 */
public interface Transportable {

    /**
     * Returns the weight in grams.
     */
    public int weight();

    /**
     * Returns whether the object is hazardous.
     */
    public boolean isHazardous();
}
