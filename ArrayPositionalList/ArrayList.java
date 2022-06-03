
package com.assignment2;

import java.util.Arrays;

/**
 * Navkaran Singh 3119008
 */
public class ArrayList<E> implements List<E> {
    
    public static final int CAPACITY = 4;
    private E[] data;
    private int size = 0;
    
    
    public ArrayList(int capacity){
       data = (E[]) new Object[capacity];
    }
    public ArrayList(){
      this(CAPACITY);
    }
    
    public int size(){
     return size;
    }
    
    public boolean isEmpty(){
     return (size==0);
    }
    
    public E get(int i) throws IndexOutOfBoundsException {
       checkIndex(i,size);
       return data[i];
       
    }
    
    public E set(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i,size);
        E temp = data[i];
        data[i] = e;
        return temp;  
         
    }
    
    public void add(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i,size+1);
        if(size==data.length){
           resize(size+1);
        }
       for(int k = size-1;k>=i;k--){
         data[k+1] = data[k];
       }
       data[i] = e;
       size++;
       if(size<(data.length/2)){
          resize(size);
        }
    }
    
    public void add(E e ) throws IndexOutOfBoundsException {
        
        if(size==data.length){
           resize(size+1);
        }
        data[size] = e;
        size++;
        if(size<(data.length/2)){
          resize(size);
        }
       
    }
    
    public E remove(int i) throws IndexOutOfBoundsException{
        checkIndex(i,size);
        E temp = data[i];
        for(int k = i; k<size-1;k++){
          data[k] = data[k+1];
        }
        data[size-1]= null;
        size--;
        if(size<(data.length/2)){
          resize(size);
        }
        return temp;
       
    }
    
    protected  void checkIndex(int i, int n) throws IndexOutOfBoundsException{
      if(i<0 || i>=n){
        throw new IndexOutOfBoundsException("Ilegal Index " +i);
      }
    }
   
    protected void resize(int capacity){
      E[] temp = (E[]) new Object[capacity];
      for(int k = 0; k<size;k++){
        temp[k] = data[k];
      }
      data = temp;
      
    }
    
    public boolean equals(Object o){
       if(o== null){
         return false;
       }
       if(getClass() != o.getClass()){
         return false;
       }
       
       ArrayList other = (ArrayList) o;
       
       if(this.size()!=other.size()){
         return false;
       }
       
       for(int i = 0;i<other.size();i++){
          if(!(this.get(i).equals(other.get(i)))){
            return false;
          }
       }
      return true;
    }
    
    
    public String toString(){
         return Arrays.toString(data);
    }
    
}
