package Interfaces;

/**
 * Interfaces Demo
 * From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 */

/**
 * Interface for objects that can be insured.
 */
public interface Insurable extends Sellable, Transportable {

    /**
     * Returns insured value in cents
     */
    public int insuredValue();
}
