/**
 *  Navkaran Singh 3119008
 */
import java.util.*;

public class LinkedJavaStack<E> implements Stack<E>{
      private LinkedList<E> list = new LinkedList<>();
      public LinkedJavaStack(){}
      public int size(){
          return list.size();
      }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public void push(E e) {
        list.addFirst(e);
    }

    public E top() {
        return list.getFirst();
    }

    public E pop() {
        return list.removeFirst();
    }
}
