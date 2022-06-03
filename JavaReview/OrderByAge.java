import java.util.Comparator;
/**
 * ACS-1904-003
 * Lab 8 (Extra Work) Sample solution
 */
public class OrderByAge implements Comparator<Person>{
    public int compare(Person a, Person b){
        return b.getAge() - a.getAge();
    }
}
