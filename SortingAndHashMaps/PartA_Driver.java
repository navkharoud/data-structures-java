import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * Navkaran Singh 3119008
 */
public class PartA_Driver {

    public static void main(String[] args) throws FileNotFoundException {
        ProbeHashMap<String, Integer> probeMap = new ProbeHashMap<>();
        Scanner f = new Scanner(new File("C:\\Users\\Nav\\Downloads\\New folder\\PartA.txt"));
        f.useDelimiter("[^a-zA-Z']+");
        int counter = 1;
        while(f.hasNext()){
            String s = f.next().toLowerCase();
            Integer i = probeMap.put(s,counter);
            if(i!=null){
              probeMap.put(s, ++i);
            }
        }
        // System.out.println(probeMap.size());
        // 1673 words
        Entry<String,Integer>[] arr = new Entry[probeMap.size()];
        int cap = 0;
        for(Entry<String,Integer> e : probeMap.entrySet()){
          arr[cap] = e;
          cap++;
        }
        MergeSort.mergeSort(arr, new OrderByFrequency());
        
        System.out.println("The Word frequency is: ");
        System.out.println(" Word \tfrequency");
        for(int i = 0;i<10;i++){
          System.out.println((i+1)+". "+arr[i].getKey()+"\t "+arr[i].getValue());
        }
    }
    
}
