/**
 * ACS-2947
 * Sample Driver code for Casting example
 */
public class Driver {

    public static void main(String[] args) {
        Person[] people = {new Student("GRF756", "Ron Weasley", 12),
            new Student("GRF777", "Harry Potter", 12),
            new Student("SLY666", "Tom Riddle", 16),
            new Instructor("SLY143", "Severus Snape", 36)};
        Student lv = new Student("SLY666", "Lord Voldemort", 66);
        for (Person p : people) {
            if (p.equals(lv)) {
                System.out.println("(dramatic sound effect)");
                System.out.println(p.getName() + " is " + lv.getName() + "!!!");
            } else {
                System.out.println("no match");
            }
        }
    }
}
