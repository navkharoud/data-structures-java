package com.assignment2;


import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Navkaran Singh 3119008
 */
public class PartA_Driver {

    public static void main(String[] args)
            throws InterruptedException {

        int count = 0;
        boolean running = true;

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("blue");
        colours.add("green");
        colours.add("yellow");
        // could also use colours as ENUMs
        
        ArrayList<String> randomSequence = new ArrayList();

        while (running) {
            randomSequence.add(addRandomColour(colours)); // adds random colour from the colours arraylist
            
            for (int j = 0; j < randomSequence.size(); j++) {
                System.out.print(randomSequence.get(j));
                Thread.sleep(2500);
                // for(int k = 0; k<randomSequence.get(j).size;k++){
                //       System.out.println("\b")); 
                // }
                // use to erase the colours characters
                //but not outputting the first system.out.println
                for(int x = 0; x<32;x++){
                  System.out.print("\n");
                }
             }

            ArrayList<String> userAnswers = new ArrayList();
            String input = JOptionPane.showInputDialog("Enter Input"); // get user answers in one string
            String[] arr = input.split("\\s"); // store answers in an array 
            // stores into arraylist to use equals method
            for (int i = 0; i < arr.length; i++) {
                userAnswers.add(arr[i].toLowerCase());
            } 
            
            //System.out.println(randomSequence+" "+userAnswers+" "+Arrays.toString(arr));
            // could also straight away compare to the answers Array using a for loop aswell
            if (randomSequence.equals(userAnswers)) {
                 count++;
             }
            else{
                 System.out.println("Game Over! Your score is " + count);
                 running = false;
            }
        }

    }

    public static String addRandomColour(ArrayList<String> colours) {
        Random r = new Random();
        return colours.get(r.nextInt(4)).toLowerCase();
    }
}
