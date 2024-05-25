package HasingRevision;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        solution sol = new solution();
        System.out.println(Arrays.toString(sol.val(arr)));

    }

}
class solution {
    public  int[] val(int[] arr) {
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            if(map.containsKey(difference) && map.get(difference)!=i){
                return new int[] {i,map.get(difference)};
            }
        }
        return new int[] {};
    }
}