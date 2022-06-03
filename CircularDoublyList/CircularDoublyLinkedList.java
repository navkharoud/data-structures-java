
package com.assignement1;

/**
 *Navkaran Singh 3119008
 * @author Nav
 */
public class CircularDoublyLinkedList<E> {
    private static class Node<E>{
        private E element;
        private Node<E> next;
        private Node<E> prev;
        public Node(E e, Node<E> n, Node<E> p){
            element= e;
            next = n;
            prev = p;
         }

        public E getElement(){
            return element;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> n){
            next= n;
        }
        
        public Node<E> getPrev(){
          return prev;
        }
        
        public void setPrev(Node<E> p){
          prev = p;
         }
    }
    
    private int size = 0;
    private Node<E> lastNode = null;
    
     
    public CircularDoublyLinkedList(){
    }
    
    public int size(){
      return size;
    }
    
    public boolean isEmpty(){
      return (size==0);
    }
    
    public E first(){
     if(isEmpty()){
       return null;
     }
     return lastNode.getNext().getElement();
    }
    
    public E last(){
     if(isEmpty()){
       return null;
     }
     return lastNode.getElement();
    }
    
    public void addFirst(E e){
       if(size == 0){
         lastNode = new Node<>(e,null,null);
         lastNode.setNext(lastNode);
         lastNode.setPrev(lastNode);
            size++;
       }
       else {
          addBetween(e,lastNode,lastNode.getNext() );
       }
        
    }
    
    public void addLast(E e){
        if(size == 0){
         lastNode = new Node<>(e,null,null);
         lastNode.setNext(lastNode);
         lastNode.setPrev(lastNode);
         size++;
       }
        else{
            addBetween(e, lastNode,lastNode.getNext());
        }
      
    }
    
    public E removeFirst(){
      if(isEmpty()){
       return null;
      }
      return remove(lastNode.getNext());
    }
    
    public E removeLast(){
    if(isEmpty()){
       return null;
      }
      return remove(lastNode);
    }
    
    public void rotateForward(){
        if(lastNode!= null){
             lastNode = lastNode.getNext();
        }
     }
         
    public void rotateReverse(){
        if(lastNode!=null){
           lastNode = lastNode.getPrev();
         }
    }
    
    private void addBetween(E e, Node<E> pred, Node<E> succ){
     Node<E> newer = new Node<>(e, succ, pred);
     pred.setNext(newer);
     succ.setPrev(newer);
     size++;
    }
    
    private E remove(Node<E> node){
      Node<E> pred = node.getPrev();
      Node<E> succ = node.getNext();
      pred.setNext(succ);
      succ.setPrev(pred);
      size--;
      return node.getElement();
    }
    
    public String toString(){
      
       String s = "List :";
         for(int i = 0; i< size; i++){
           Node<E> newest = lastNode.getNext(); 
           s+=" "+newest.getElement();
           lastNode = lastNode.getNext();
          }
        
        return s+" "+size;
      
    }
}
