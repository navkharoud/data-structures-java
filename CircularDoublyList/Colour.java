
package com.assignement1;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public enum Colour {
    BLACK("Wild"),BLUE("Blue"),GREEN("Green"),YELLOW("Yellow"),RED("Red");
    
    private String color;
    private Colour(String c){
      color = c;
    }
    public String toString(){
      return color;
    }
}
