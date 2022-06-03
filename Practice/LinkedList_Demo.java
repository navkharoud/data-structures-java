
/* 
 * Singly linked list demo
 * Requires SinglyLinkedList, DoublyLinkedList
 */
public class LinkedList_Demo {

    public static void main(String args[]) {
        SinglyLinkedList<Integer> slist = new SinglyLinkedList<>();
        slist.addFirst(1);
        slist.addLast(2);
        slist.addLast(3);
        System.out.println(slist);
        slist.removeFirst();
        System.out.println(slist);

        DoublyLinkedList<Integer> dlist = new DoublyLinkedList<>();
        dlist.addFirst(4);
        dlist.addLast(5);
        dlist.addFirst(6);
        System.out.println(dlist);
        dlist.removeLast();
        System.out.println(dlist);
    }
}
