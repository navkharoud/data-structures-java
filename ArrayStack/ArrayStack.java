/**
 *  Navkaran Singh 3119008
 */


public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;

    public  ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
     }
    public ArrayStack() {
        this(CAPACITY);
    }
    public int size(){
         return(t+1);
    }


    public boolean isEmpty() {
        return (t == -1);
    }


    public E pop() {
        if(isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;

    }


    public E top() {
         if (isEmpty()){
             return null;

         }
         return data[t];

    }


    public void push(E e) throws IllegalStateException{
         if(size() == data.length) throw new IllegalStateException("Stack is full");
         data[++t] = e;
    }
}
