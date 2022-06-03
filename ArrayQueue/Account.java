
package com.assignement1;

/**
 * Navkaran Singh 3119008
 * @author Nav
 */
public class Account {
    private Queue<Integer> shares;
    private int runningTotal;

    public Queue<Integer> getShares() {
        return shares;
    }

    public void setShares(Queue<Integer> shares) {
        this.shares = shares;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public void setRunningTotal(int runningTotal) {
        this.runningTotal = runningTotal;
    }
    
    public Account(){
     shares = new ArrayQueue<>();
    }
    public Account(Queue<Integer> e){
     shares = e;
    }
    public void buyShares(int num, int price){
      for(int i = 0;i<num;i++){
        shares.enqueue(price);
        runningTotal+=price;
      }
      
    }
    public void sellShares(int sellNum, int price){
        int capital = 0;
        for(int j =0; j<sellNum; j++){
            if(shares.first()!=null){
               runningTotal = runningTotal-shares.first();
             }
             capital += price-shares.dequeue();
             
        }
        System.out.println();
        if(capital>=0){
          System.out.println("Capital Gain: = $" + capital);
        }
        else {
           System.out.println("Capital Loss: = $" + capital);
       
        }
     
    
    }
    public int getTotalValue(){
      return runningTotal;
    }
    public int getTotalShares(){
        return shares.size();
      
    }
}
