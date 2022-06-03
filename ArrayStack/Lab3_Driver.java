/**
 *  Navkaran Singh 3119008
 */

import java.util.*;

public class Lab3_Driver {

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String input = kb.nextLine();
        String in = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Character[] arr = new Character[in.length()];
        for(int i = 0;i<in.length();i++){
            arr[i] = (Character)in.charAt(i);
        }

        Stack<Character> stack = new ArrayStack<>(arr.length);
        Character[] reversed = new Character[arr.length];
        for(int i = 0; i<arr.length;i++){
            stack.push(arr[i]);
        }
        for(int j = 0; j<arr.length; j++){
            reversed[j] = stack.pop();
        }

        if(Arrays.equals(arr,reversed)){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }
    }

}
