package HasingRevision;

import java.util.HashMap;
import java.util.Map;

public class GratestValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,2,2,1,7};//n =9
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i]) + 1 );
            }else {
                map.put(arr[i],1 );
            }

        }
        for (int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println(entry);;
        }

        for (int key: map.keySet()) {
            if(map.get(key) ==1) {
                System.out.println(key);
            }
        }



        //System.out.println(map);
    }
}
