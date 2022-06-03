
/**
 * Circularly Linked List Demo
 * Requires Exercise and CircularlyLinkedList
 */

public class WorkoutCircuit {

    public static void main (String args[]){
        // create new CLL and add objects/nodes
        CircularlyLinkedList<Exercise> workout = new CircularlyLinkedList<Exercise>();
        workout.addFirst(new Exercise("pushup", 10));
        workout.addLast(new Exercise("burpee", 5));
        workout.addLast(new Exercise("squat", 10));
        workout.addLast(new Exercise("situp", 5));
        

        System.out.println("\nLet's begin our workout circuit!\n");
        // print 2 cycles
        for(int i=0; i<3=2; i++){
            System.out.println("Round " + i + ":");
            for (int j=0; j< workout.size(); j++){
                Exercise ex = workout.first();
                System.out.println("OK, now let's do " + ex.getReps() + " " + ex.getName() + "s");
                String countdown = "";
                for (int k=ex.getReps(); k>0; k--)
                    countdown = countdown + k + "... "; 
                System.out.println(countdown + "Great job! \n");
            workout.rotate();
            }
        }
        System.out.println("\nWater break!");   //end of this part of their workout
    } 
}
