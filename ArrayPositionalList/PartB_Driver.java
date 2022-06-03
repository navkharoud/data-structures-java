package com.assignment2;

/**
 * Navkaran Singh 3119008
 *
 * @author Nav
 */
public class PartB_Driver {

    public static void main(String[] args) {
        ArrayPositionalList<Integer> intList = new ArrayPositionalList<>(7);

        intList.addFirst(9);
        intList.addFirst(0);
        intList.addFirst(3);
        intList.addFirst(5);
        intList.addFirst(7);
        intList.addFirst(6);
        intList.addFirst(8);
        System.out.println(intList+" ");
        insertionSort(intList);
        System.out.println(intList);
    }

    public static void insertionSort(ArrayPositionalList<Integer> in) {

        Position<Integer> cursor = in.after(in.first());

        for (int i = 1; i < in.size() - 1; i++) {
            int counter = cursor.getElement();
            int j = i;
            
            Position<Integer> pointer = in.before(cursor);
            
            while (j > 0 && pointer.getElement() > counter) {
                
                in.set(cursor, pointer.getElement());
                in.set(pointer, counter);
                j--;
                if (j > 0) {
                    cursor = in.before(cursor);
                    in.set(cursor, counter);

                } else{
                   in.set(pointer, counter);
                }

            }

            cursor = in.after(cursor);
        }

    }
}
