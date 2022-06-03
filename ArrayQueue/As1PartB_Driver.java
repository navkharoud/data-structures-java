
package com.assignement1;
import java.util.*;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public class As1PartB_Driver {

   
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Queue<Integer> shares = new ArrayQueue<>();
        Account account = new Account(shares);
        displayMenu(kb,account);
        
        
    }
   
    public static void displayMenu(Scanner kb,Account a){
        int input;
        do{
         System.out.println("Make a selection: \n 1.Buy Shares \n 2.Sell Shares \n "
                + "3.Quit");
      
        input = kb.nextInt();
      
        if(input==1){
            System.out.println("Enter number of shares to buy: ");
            int buyNum = kb.nextInt();
                if(buyNum<0){
                   System.out.println("Wrong input, Try Again");
                   buyNum = kb.nextInt();
                }
            System.out.println("Enter the purchase price per Share: ");
            int priceNum = kb.nextInt();
                if(priceNum<0){
                   System.out.println("Wrong input, Try Again");
                   priceNum = kb.nextInt();
                }
            a.buyShares(buyNum, priceNum);
            summary(a);
            
        }
        if(input==2){
          System.out.println("Enter the number of shares to sell: ");
          int sellNum = kb.nextInt();
              if(sellNum<0){
                   System.out.println("Wrong input, Try Again");
                   sellNum = kb.nextInt();
                }
          System.out.println("Enter the selling price per Share: ");
          int sellPrice = kb.nextInt();
                  if(sellPrice<0){
                   System.out.println("Wrong input, Try Again");
                   sellPrice = kb.nextInt();
                }
          a.sellShares(sellNum, sellPrice);
          summary(a);
        }
        if(input!= 1 && input!= 2 && input!= 3){
          System.out.println("Wrong input, Try again!");
        }
       } while(input!=3);
        System.out.println("*** End of Program ***");
    
     
    }
    public static void summary(Account a){
      System.out.println();
      System.out.println("Total Shares: "+ a.getTotalShares());
      System.out.println("Total Share Value: $"+ a.getTotalValue());
      System.out.println("--------------------------------------------");
    }
   
}
