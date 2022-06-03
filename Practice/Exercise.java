package LinkedLists;  

/**
 * Circularly Linked List Demo
 * Requires WorkoutCircuit and CircularlyLinkedList
 */

public class Exercise {
    private String name;        // name of movement
    private int reps;           // number of repetitions to complete
   
    /**
     * Creates an exercise object with a given name and number of reps
     * @param name  name of exercise movement
     * @param reps   number of repetitions to be completed
    */
    
    public Exercise(String name, int reps){
        this.name = name;
        this.reps = reps; 
    }
    
    /**
     * Returns the name of the exercise
     * @return the exercise name
     */
    public String getName(){return name;}
    
    /**
     * Returns the number of repetitions to be done for each exercise
     * @return reps of each exercise
     */
    
    public int getReps(){return reps;}
    
    /**
     * Returns a string representation of the exercise
     * @return name of exercise
     */
        
    public String toString(){
        return name;
    }
}

