import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Pairs {
    public static void main(String[] args) {

        int[] arr = { 10, 5, 2, 3, -6, 9, 11 };
        int target = 4;

        for (int x : arr) {
            for (int y : arr) {
                if (x != y && x + y == target) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
       // Collections.sort(arr);
        System.out.println(Arrays.asList(arr));
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int x:arr){
        // hm.put(x, hm.getOrDefault(x,0)+1);
        // }
        // for(int x:arr){
        // if(hm.containsKey((target-x)) && hm.get(target-x)+target ){

        // }
        // }
    }
}
