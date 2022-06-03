
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Navkaran Singh 3119008
 */
public class PartB_Driver {

    public static void main(String[] args) throws FileNotFoundException {
        ProbeHashMap<String, PostalCode> map = new ProbeHashMap<>();
        //LinkedChainHashMap<String, PostalCode> map = new LinkedChainHashMap<>();
        Scanner f = new Scanner(new File("C:\\Users\\Nav\\Downloads\\New folder\\PartB.txt"));
        while (f.hasNext()) {
            String[] str = f.nextLine().split(",");
            PostalCode postal = new PostalCode(str[0], str[1], str[2], Double.parseDouble(str[3]), Double.parseDouble(str[4]));
            map.put(str[0], postal);
        }
        System.out.println("Total: " + map.size());
        System.out.println("Number Of Collisions: " + map.getCollisions());

        PostalCode[] arr = new PostalCode[map.size()];
        int cap = 0;
        for (Entry<String, PostalCode> e : map.entrySet()) {
            arr[cap] = e.getValue();
            cap++;
        }

        Scanner kb = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("diplay by code (C) or longitude (L) (any other key to quit)");
            String input = kb.next();
            if (input.equalsIgnoreCase("c")) {
                Arrays.sort(arr);
                for (PostalCode p : arr) {
                    System.out.println(p);
                }
            }
            else if (input.equalsIgnoreCase("l")) {
                QuickSort.quickSortInPlace(arr, new OrderByLatitude(), 0, arr.length-1);
                for (PostalCode p : arr) {
                    System.out.println(p);
                }
            } else {
                break;
            }
        }
        

    }
}
