
package com.assignement1;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public class As1PartA_driver {

    public static void main(String[] args) {
        Player simba = new Player("Simba");
        Player nala = new Player("Nala");
        Player timon = new Player("Timon");
        Player pumba = new Player("Pumba");
       
        
        CircularDoublyLinkedList<Player> players = new CircularDoublyLinkedList<>();
          players.addLast(pumba);
          players.addLast(timon);
          players.addLast(nala);
          players.addLast(simba);
        
        GameSim uno = new GameSim(players);
       
        uno.startGame();
       
      
    }
    
}
