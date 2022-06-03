/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment2;

import java.util.Arrays;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public class ArrayPositionalList<E>{
    
    private static class Site<E> implements Position<E> {

        private int index;
        private E element;

        public Site(E e, int i) {
            index = i;
            element = e;
        }

        public E getElement() throws IllegalStateException {
            if (index == -1) {
                throw new IllegalStateException("Position no longer valid");
            }
            return element;
        }

        public void setElement(E e) {
            element = e;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int i) {
            index = i;
        }
        
    }

    public static final int CAPACITY = 16;
    private Site<E>[] data;
    private int size = 0;

    public ArrayPositionalList() {
        this(CAPACITY);
    }

    public ArrayPositionalList(int capacity) {
        data = (Site<E>[]) new Site[capacity];
    }
    
    private Site<E> validate(Position<E> p) throws IllegalArgumentException{
       if(!(p instanceof Site)){
             throw new  IllegalArgumentException("Illegal Position");
        }
       Site<E> temp = (Site<E>) p;
       if(temp.getIndex()<0 || temp.getIndex()>= size){
            throw new  IllegalArgumentException("Invalid Index");
       }
       return temp;
    }
    
    public int size(){
      return size;
    }
    
    public boolean isEmpty(){
      return (size==0);
    }
    
    public Position<E> first(){
      return data[0];
    }
    
    public Position<E> last(){
      return data[size-1];
    }
    
    public Position<E> before(Position<E> p) throws IllegalArgumentException{
         Site<E> temp =validate(p);
         return data[temp.getIndex()-1];
         }
    
     public Position<E> after(Position<E> p) throws IllegalArgumentException{
        Site<E> temp =validate(p);
         return data[temp.getIndex()+1];
     }
     
    public Position<E> addFirst(E e){
        if(size==data.length){
          throw new IllegalStateException("List is at capacity, Cannot add");
        }
        Site<E> site = new Site<>(e,0);
        for(int i = size-1; i>=0;i--){
           data[i+1]= data[i];
           data[i+1].setIndex(i+1);
        }
        data[0] = site;
        size++;
        return site;
    }
    public Position<E> addLast(E e){
        if(size==data.length){
          throw new IllegalStateException("List is at capacity, Cannot add");
        }
       Site<E> site = new Site<>(e,size);
       data[size] = site;
       size++;
       return site;
    
    }
    
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
      if(size==data.length){
          throw new IllegalStateException("List is at capacity, Cannot add");
      }
        Site<E> temp = validate(p);
      int index = temp.getIndex();
      for(int i = size-1;i>=index;i--){
          data[i].setIndex(i+1);
           data[i+1]= data[i];
           
      }
      data[index] = new Site<>(e,index-1);
      size++;
      return temp;
    }
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException{
     if(size==data.length){
          throw new IllegalStateException("List is at capacity, Cannot add");
      }
      Site<E> temp = validate(p);
      int index = temp.getIndex();
      for(int i = size-1;i>=index;i--){
          data[i].setIndex(i+1);
           data[i+1]= data[i];
           
      }
      data[index+1] = new Site<>(e,index+1);
      size++;
      return temp;
    }
    
    public E set(Position<E> p, E e) throws IllegalArgumentException{
       Site<E> temp = validate(p);
       int index = temp.getIndex();
       E element = temp.getElement();
       temp.setElement(e);
       data[temp.getIndex()] = temp;
       return element;
    }
  
    public E remove(Position<E> p) throws IllegalArgumentException{
       Site<E> temp = validate(p);
       int index = temp.getIndex();
       for(int i = index; i<size-1;i++){
          data[i] = data[i+1];
          data[i].setIndex(i);
        }
        data[size-1]= null;
        size--;
       return temp.getElement();
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i<size;i++){
         sb.append("[").append(data[i].getIndex()).append("] ");
         sb.append(data[i].getElement()).append(" ");
       }
      return sb.toString();
    }
    
    
    
}
