package Interfaces;

/**
 * ACS-2947
 * Inheritance Demo
 * Sample Driver
 */

import java.util.ArrayList;
public class Driver{
    public static void main (String[] args){
        ArrayList<Sellable> items = new ArrayList<>();
        items.add (new Photograph("Photo 1", 10, true));
        items.add (new BoxedItem ("Boxed Item 1", 20, 50, false));
        for (Sellable s : items){
            System.out.println(s);
        }
    }
}
