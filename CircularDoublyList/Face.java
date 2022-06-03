
package com.assignement1;

/**
 *Navkaran Singh 3119008
 * @author Nav
 */
public enum Face {
    ZERO("0"), ONE("1"),TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),SIX("6"),SEVEN("7"),EIGHT("8"),
    NINE("9"),SKIP("Skip"),REVERSE("Reverse"),WILD("*");
    private String display;
    
    private Face(String d){
      display = d;
    }
    public String toString(){
      return display;
    }
}
