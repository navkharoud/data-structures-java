package Generics;
/**
 * ACS-2947
 * Generic Pair Demo
 */

public class PairDriver {

    public static void main(String[] args) {
        ObjectPair op = new ObjectPair("Potter", 777);
        String family = (String) op.getFirst();
        int vaultNum = (int) op.getSecond();

        Pair<String, Double> bid = new Pair<>("ORCL", 32.07);  // rely on type inference

        String stock = bid.getFirst();
        double price = bid.getSecond();

        System.out.println(stock);
        System.out.println(price);

        Pair<String, Double>[] holdings;

        /*
        holdings = new Pair<>[25];                  // illegal; compile error
         */
        
        holdings = new Pair[25];                    // correct, but warning about unchecked cast
        holdings[0] = new Pair<>("ORCL", 32.07);    // valid element assignment
    }

}
