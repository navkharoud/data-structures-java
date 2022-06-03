
package com.assignement1;
import java.util.*;
/**
 *
 * @author Nav
 */
public class Deck {
   private SinglyLinkedList<Card> deck = new SinglyLinkedList<>();
   private int numOfCards;
  
   
   public Deck(){
     numOfCards = 100;
     createCards();
     
 }

    public SinglyLinkedList<Card> getDeck() {
        return deck;
    }

    public void setDeck(SinglyLinkedList<Card> deck) {
        this.deck = deck;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

    public void setNumOfCards(int numOfCards) {
        this.numOfCards = numOfCards;
    }
   
   public void Shuffle(){
      SinglyLinkedList<Card> half1 = new SinglyLinkedList<>();
      SinglyLinkedList<Card> half2 = new SinglyLinkedList<>();
      
      for(int i = 0; i<(numOfCards/2);i++){
         half1.addFirst(deck.removeFirst());
        }
      for(int i = 0; i<(numOfCards/2);i++){
         half2.addFirst(deck.removeFirst());
        }
      for(int i = 0; i<(numOfCards/2);i++){
         deck.addFirst(half1.removeFirst());
         deck.addFirst(half2.removeFirst());
        }
    
      
   }
   
   private void createCards(){
     for(int i = 0; i<4;i++){
       deck.addFirst(new Card(Colour.BLACK,Face.WILD));
    }
    for(Colour c: Colour.values()){
       for(Face f: Face.values()){
         if(!(c==Colour.BLACK || f==Face.WILD)){
            deck.addFirst(new Card(c,f));
            deck.addFirst(new Card(c,f));
         }
       }
    }
      
    
   }
   
   public Card topCard(){
     return deck.removeFirst();
     
   }
   
   public ArrayList<Card> drawCard(int handSize){
       ArrayList<Card> c = new ArrayList<>();
       for(int i = 0; i<handSize; i++){
         c.add(topCard());
     }
     return c;
   }
   public String toString(){
     return deck.toString();
   }
   
  
}
