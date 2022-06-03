/**
 * Person interface for Casting example
 * From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 */

public interface Person {

    public boolean equals(Person other);   // is this the same person?

    public String getName();               // get this person's name

    public int getAge();                   // get this person's age
}
