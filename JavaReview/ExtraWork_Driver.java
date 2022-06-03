import java.util.Arrays;
/**
 * ACS-1904-003
 * Lab 8 (Extra Work) Sample solution
 */
public class ExtraWork_Driver{
    public static void main(String[] args){
        Person[] wizards = {new Person("Harry", "Potter", 13),
                new Person("Hermione", "Granger", 13),
                new Person("Ron", "Weasley", 13),
                new Person("Ginny", "Weasley", 12),        
                new Person("Remus", "Lupin", 33),
                new Person("Albus", "Dumbledore", 150)};
        Arrays.sort(wizards);
        System.out.println("Natural ordering:");
        for (Person p : wizards)
            System.out.println(p);
        Arrays.sort(wizards, new OrderByAge());
        System.out.println("\nOrdered by age:");
        for (Person p : wizards)
            System.out.println(p + ", " + p.getAge());
    }
}
