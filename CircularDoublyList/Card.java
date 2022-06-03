
package com.assignement1;

/**
 *Navkaran Singh 3119008
 * @author Nav
 */
public class Card {
    private Colour colour;
    private Face face;
    
    public Card(Colour c , Face f){
      colour =c;
      face = f;
            
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setFace(Face face) {
        this.face = face;
    }
    
    public Colour getColour(){
      return colour;
    }
    public Face getFace(){
      return face;
    }
    
    public String toString(){
      return colour.toString()+" "+face.toString();
    }
     
}
