/**
 * ACS-1904-003
 * Lab 8 (Extra Work) Sample solution
 */
public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String f, String l, int a){
        firstName = f;
        lastName = l;
        age = a;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
    
    // Alphabetical by last name first, followed by first name 
    public int compareTo(Person p){
        int i = lastName.compareTo(p.lastName);
        if (i == 0) return firstName.compareTo(p.firstName);
        return i;
        
        // Reverse-alphabetical order by first name        
        // return p.firstName.compareTo(firstName);
        
        // Alphabetical order by first name
        // return firstName.compareTo(p.firstName);
    }
    
    // required for OrderByAge Comparator
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return getName();
    }
}
