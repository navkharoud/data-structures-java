
package com.assignement1;
import java.util.*;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public class Player {
    private String name;
    private ArrayList<Card> cards;
    
   
    public Player(String n){
      cards = new ArrayList<>();
      name = n;
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    public Card playCard(Card c){
        for(int i = 0; i<cards.size(); i++){
           Card play = cards.get(i);
           if(play.getColour()==c.getColour() || play.getFace()==c.getFace()){
               cards.remove(i);
               return play;
           }
           
           if(play.getColour()==Colour.BLACK){
               cards.remove(i);
               return play;
            }
         }
        
     return null;
          
    }
    
    public String toString(){
        String s = "";
        for(Card c : cards){
          s+=" "+c+",";
        }
       return "( "+name+"'s hand: "+s+")";
    }
    
   

   
}
