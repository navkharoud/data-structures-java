/**
 * ACS-2947
 * Instructor class for Casting example
 */
public class Instructor implements Person {

    String id;
    String name;
    int age;

    public Instructor(String i, String n, int a) {  // simple constructor
        name = n;
        age = a;
    }

    public String getID() {
        return id;
    }

    public String getName() {       // from Person interface
        return name;
    }

    public int getAge() {           // from Person interface
        return age;
    }

    public boolean equals(Person other) {                   // from Person interface
        if (!(other instanceof Instructor)) {
            return false;   // cannot possibly be equal
        }
        Instructor i = (Instructor) other;                  // explicit cast now safe
        return id.equals(i.id);                             // compare IDs
    }

    public String toString() {     // for printing
        return "Instructor(ID:" + id + ", Name:" + name + ", Age:" + age + ")";
    }

}
