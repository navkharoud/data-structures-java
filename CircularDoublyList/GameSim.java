
package com.assignement1;
import java.util.*;

/**
 *
 * @author Nav
 */
public class GameSim {
    private Deck deck;
    private Card topCard;
   
    private CircularDoublyLinkedList<Player> players;
    private final int handsize = 7;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Card getTopCard() {
        return topCard;
    }

    public void setTopCard(Card topCard) {
        this.topCard = topCard;
    }

    public CircularDoublyLinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(CircularDoublyLinkedList<Player> players) {
        this.players = players;
    }
   
    
            
    public GameSim(CircularDoublyLinkedList<Player> p){
      deck = new Deck();
      players = p;
      dealCards();
      topCard = deck.topCard();
     
      
    }

  
    private void dealCards(){
        
     for(int i = 0;i<players.size();i++){
         deck.Shuffle();
     }
    
     for(int i = 0; i< players.size(); i++){
        
         ArrayList<Card> hand = deck.drawCard(handsize);
         players.first().setCards(hand);
         players.rotateForward();
        
     }
      
     
    }
     
    public void skip(){
       players.rotateForward();
       System.out.println(players.first().getName()+" misses a turn");
    }
    
    public void reverse(){
        for(int i = 0; i< players.size();i++){
             players.rotateReverse();
        }
        System.out.println("Game reverses direction");
      
      
    }
    
    public Card pickupFromDeck(){
       Card pickup = deck.topCard();
       players.first().getCards().add(pickup);
       return pickup;
    }
    
    public Card wild(){
       Card c = players.first().getCards().get(0);
       System.out.println("Colour is now "+c.getColour());
       return c;
    
    }
   
    
    public void startGame(){
       System.out.println("Lets Play UNO!!!");
       System.out.println();
       
       if(topCard.getColour()==Colour.BLACK){
          topCard = deck.topCard();
       }
       
       System.out.println("First Card: "+topCard);
       
       boolean run = true;
       while(run){
           
            Player p = players.first();
            System.out.println(p);
            
            Card playing = p.playCard(topCard);
            
          
            if(playing == null){
               playing = pickupFromDeck();
               
               System.out.println(p.getName()+" has no play, Draws "+playing);
               if(playing.getColour()==Colour.BLACK){
                  playing = wild();
                  
                }
               
               if(playing.getColour()==topCard.getColour() || playing.getFace()==topCard.getFace()){
                     System.out.println(p.getName()+" plays "+ playing);
                     p.getCards().remove(playing);
                     players.rotateForward();
                     System.out.println();
                }
               else{
                  System.out.println("Cant play this");
                  players.rotateForward();
                  System.out.println();
                }
            }
            else {
            
            System.out.println(p.getName()+" Plays "+playing);
            if(playing.getFace()==Face.WILD){
               playing = wild();
            }
            
            if(playing.getFace()==Face.SKIP){
               skip();
            }
            if(playing.getFace()==Face.REVERSE){
              reverse();
            }
            if(p.getCards().size()==1){
               System.out.println(p.getName()+" yells UNO!!!");
               
            }
            
            if(p.getCards().isEmpty()){
               System.out.println(p.getName()+" wins!!!");
               run = false;
               break;
            }
            topCard = playing;
            players.rotateForward();
            System.out.println();
            }
            
            
            
            
       }
       
       
    }
   
    
   
    
}
