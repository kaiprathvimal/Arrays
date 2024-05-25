package HasingRevision;

import java.util.HashMap;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,5,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< arr1.length;i++) {
            if(map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i])+ 1 );
            } else {
                map.put(arr1[i], 1);
            }

        }
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i])+ 1 );
            } else {
                map.put(arr2[i], 1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key) >1) {
                System.out.print(key);
            }
        }
        System.out.println(map);

//        HashSet<Integer> set = new HashSet<>();
//        int count=0;
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if(set.contains(arr2[i])) {
//                count++;
//                set.remove(arr2[i]);
//            }
//        }
//        System.out.println(count + " " + set);
    }
}
