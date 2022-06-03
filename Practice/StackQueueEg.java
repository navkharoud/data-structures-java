/*
 *  From Data Structures and Algorithms in Java, Sixth Edition, Goodrich et al.
 *  Requires Stack interface, ArrayStack implementation
 */

public class StackQueueEg {
    public static void main(String[] args) {
        Stack<Integer> S = new LinkedStack<>();  // contents: ()
        System.out.println("Stack:");
        S.push(5);                              // contents: (5)
        S.push(3);                              // contents: (5, 3)
        System.out.println(S.size());           // contents: (5, 3)     outputs 2
        System.out.println(S.pop());            // contents: (5)        outputs 3
        System.out.println(S.isEmpty());        // contents: (5)        outputs false
        System.out.println(S.pop());            // contents: ()         outputs 5
        System.out.println(S.isEmpty());        // contents: ()         outputs true
        System.out.println(S.pop());            // contents: ()         outputs null
        S.push(7);                              // contents: (7)
        S.push(9);                              // contents: (7, 9)
        System.out.println(S.top());            // contents: (7, 9)     outputs 9
        S.push(4);                              // contents: (7, 9, 4)
        System.out.println(S.size());           // contents: (7, 9, 4)  outputs 3
        System.out.println(S.pop());            // contents: (7, 9)     outputs 4
        S.push(6);                              // contents: (7, 9, 6)
        S.push(8);                              // contents: (7, 9, 6, 8)
        System.out.println(S.pop());            // contents: (7, 9, 6)  outputs 8
        
        System.out.println("-----------------------------\n Queue:");
        Queue<Integer> Q = new LinkedQueue<>();
        Q.enqueue(5);                           //contents: (5)
        Q.enqueue(3);                           //contents: (5, 3)      
        System.out.println(Q.size());           //contents: (5, 3)      outputs 2
        System.out.println(Q.dequeue());        //contents: (3)         outputs 5
        System.out.println(Q.isEmpty());        //contents: (3)         outputs false
        System.out.println(Q.dequeue());        //contents: ()          outputs 3
        System.out.println(Q.isEmpty());        //contents: ()          outputs true
        System.out.println(Q.dequeue());        //contents: ()          outputs null
        Q.enqueue(7);                           //contents: (7)
        Q.enqueue(9);                           //contents: (7, 9)
        System.out.println(Q.first());          //contents: (7, 9)      outputs 7
        Q.enqueue(4);                           //contents: (7, 9, 4)
        
  }
    
}
